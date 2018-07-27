package com.andy.mvp.sample.control;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.andy.mvp.R;
import com.andy.mvp.lib.control.BaseFragmentActivity;
import com.andy.mvp.sample.presenter.CPresenter;
import com.andy.mvp.sample.view.CView;

/**
 * Created by andy on 2018/7/27.
 */

public class ThirdActivity extends BaseFragmentActivity implements CView {
    TextView text;
    CPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        text = (TextView) findViewById(R.id.text);
        //初始化Presenter
        presenter = new CPresenter();
        // 绑定View引用
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 断开View引用
        presenter.detachView();
    }

    @Override
    public void showFailureMessage(String msg) {
        super.showFailureMessage(msg);
        text.setText(msg);
    }

    @Override
    public void showErrorMessage() {
        super.showErrorMessage();
        text.setText("网络请求数据出现异常");
    }

    // button 点击事件调用方法
    public void getDataBuyAndPlay(View view) {
        presenter.getDataBuyAndPlay("BuyAndPlay");
    }

    // button 点击事件调用方法
    public void getDataSellAndStop(View view) {
        presenter.getDataSellAndStop("SellAndStop");
    }

    @Override
    public void showDataBuy(String data) {
        showDataBuyAndPlay(data+ "-Buy");
    }

    @Override
    public void showDataPlay(String data) {
        showDataBuyAndPlay(data+ "-Play");

    }

    @Override
    public void showDataSell(String data) {
        showDataSellAndStop(data+ "-Sell");
    }

    @Override
    public void showDataStop(String data) {
        showDataSellAndStop(data+ "-Stop");
    }

    @Override
    public void showDataBuyAndPlay(String data) {
        text.setText(data);
    }


    @Override
    public void showDataSellAndStop(String data) {
        text.setText(data);
    }

}
