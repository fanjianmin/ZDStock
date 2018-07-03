package com.rjzd.aistock.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Network;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.rjzd.aistock.Constants;
import com.rjzd.aistock.R;
import com.rjzd.aistock.api.Market;
import com.rjzd.aistock.api.MarketData;
import com.rjzd.aistock.api.PlateFlag;
import com.rjzd.aistock.api.RangeFlag;
import com.rjzd.aistock.api.StatusCode;
import com.rjzd.aistock.presenter.MarketPresenter;
import com.rjzd.aistock.ui.adapters.PlateAdapter;
import com.rjzd.aistock.ui.adapters.recycleadapter.XMBaseAdapter;
import com.rjzd.aistock.ui.views.MyItemDecoration;
import com.rjzd.aistock.ui.views.ToolbarView;
import com.rjzd.aistock.ui.views.pull2refresh.PullToRefreshView;
import com.rjzd.aistock.view.IFillDataView;
import com.rjzd.commonlib.utils.NetWorkUtil;
import com.rjzd.commonlib.utils.PixelUtil;
import java.util.List;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hition on 2017/5/24.
 */

public class PlateListActivity extends BaseActivity implements IFillDataView,XMBaseAdapter.OnLoadMoreListener,XMBaseAdapter.OnItemClickListener{

    @Bind(R.id.plate_list_toolbar)
    ToolbarView mTitleBar;
    @Bind(R.id.refresh_view)
    PullToRefreshView mRefreshView;
    @Bind(R.id.rv_plate_list)
    RecyclerView mPlateList;

    private MarketPresenter presenter;
    private PlateAdapter adapter;
    private RangeFlag mrf;
    private PlateFlag mpf;
    private int page = 0;

    public static void startActivity(Context context, RangeFlag rf, PlateFlag pf) {
        Intent intent = new Intent(context, PlateListActivity.class);
        intent.putExtra("range_flag", rf.getValue());
        intent.putExtra("plate_flag", pf.getValue());
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate_list);
        ButterKnife.bind(this);
        presenter = new MarketPresenter(this);
        parseIntent();
        initView();
        getData(page);
    }

    private void parseIntent() {
        String rangeListName = "涨幅榜";
        String plateName = "行业";
        int rfvalue = getIntent().getIntExtra("range_flag", 0);
        int pfvalue = getIntent().getIntExtra("plate_flag", 0);

        if (rfvalue == RangeFlag.RANGE_RISE.getValue()) {
            mrf = RangeFlag.RANGE_RISE;
            rangeListName = "涨幅榜";
        } else if (rfvalue == RangeFlag.RANGE_FALL.getValue()) {
            mrf = RangeFlag.RANGE_FALL;
            rangeListName = "跌幅榜";
        }
        if (pfvalue == PlateFlag.INDUSTRY.getValue()) {
            mpf = PlateFlag.INDUSTRY;
            plateName = "行业";
        } else if (pfvalue == PlateFlag.CONCEPT.getValue()) {
            mpf = PlateFlag.CONCEPT;
            plateName = "概念";
        } else if (pfvalue == PlateFlag.REGION.getValue()) {
            mpf = PlateFlag.REGION;
            plateName = "地区";
        }
        mTitleBar.setTitle(plateName+rangeListName);
    }

    private void initView() {
        mRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                page = 0;
                getData(page);
            }
        });

        // init the recycleView
        MyItemDecoration decoration = new MyItemDecoration(this, LinearLayoutManager.HORIZONTAL, 1, Color.parseColor("#e6e6e6"));
        mPlateList.addItemDecoration(decoration);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mPlateList.setLayoutManager(layoutmanager);
        HeaderView headerVeiw = new HeaderView();
        adapter = new PlateAdapter(this);
        adapter.addHeader(headerVeiw);
        mPlateList.setAdapter(adapter);

        adapter.setMore(R.layout.view_recyclerview_more, this);
        adapter.setNoMore(R.layout.view_recyclerview_nomore);
        adapter.setError(R.layout.view_recyclerview_error);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onLoadMore() {
        page ++;
        getData(page);
    }

    @Override
    public void onItemClick(int position) {
        String labelName = adapter.getItem(position).get_plateName();
        PlateStockActivity.startActivity(this,mrf,mpf,labelName);
    }

    private class HeaderView implements XMBaseAdapter.ItemView {

        @Override
        public View onCreateView(ViewGroup parent) {
            View headerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_market,null);

            RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT);
            headerView.setLayoutParams(params);
            headerView.setPadding(PixelUtil.dp2px(15),PixelUtil.dp2px(12),0,PixelUtil.dp2px(12));
            return headerView;
        }

        @Override
        public void onBindView(View headerView) {
            TextView plateNameView = ButterKnife.findById(headerView,R.id.tv_column1);
            CheckBox range = ButterKnife.findById(headerView,R.id.tv_column2);
            TextView mTop1 = ButterKnife.findById(headerView,R.id.tv_column3);

            plateNameView.setText("名称");
            range.setText("涨跌幅");
            if(mrf == RangeFlag.RANGE_RISE){
                range.setChecked(true);
            }else{
                range.setChecked(false);
            }
            mTop1.setText("领涨股");

            range.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    String title = mTitleBar.getTitle();
                    page = 0;
                    if(isChecked){
                        mrf = RangeFlag.RANGE_RISE;
                        title = title.replace("跌","涨");
                    }else{
                        mrf = RangeFlag.RANGE_FALL;
                        title = title.replace("涨","跌");
                    }
                    mTitleBar.setTitle(title);
                    getData(page);
                }
            });
        }
    }

    public void getData(int pageNo){
        if(NetWorkUtil.isNetworkConnected(this)){
            showLoadingView();
            presenter.getMarketData(mrf, mpf, pageNo,Constants.MARKET_PER_PAGE);
        }else{
            if (mRefreshView.isRefreshing()) {
                mRefreshView.setRefreshing(false);
            }
            super.showToast(R.string.network_error);
        }
    }

    @Override
    public void fillData(Object data, int dsTag) {
        dismissLoading();
        if (mRefreshView.isRefreshing()) {
            mRefreshView.setRefreshing(false);
        }

        if(dsTag == Constants.DS_TAG_MARKET){
            if(data instanceof MarketData){
                MarketData mData = (MarketData) data;
                if(page < mData.get_totalPage() && StatusCode.OK.getValue() == mData.get_status().getValue()){
                    List<Market> markets = mData.get_data();
                    if(page == 0){
                        adapter.clear();
                    }
                    adapter.addAll(markets);
                }else{
                    adapter.stopMore();
                }
            }
        }
    }

    @Override
    public void showFailedView() {
        dismissLoading();
        if (mRefreshView.isRefreshing()) {
            mRefreshView.setRefreshing(false);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onUnsubscribe();
    }
}
