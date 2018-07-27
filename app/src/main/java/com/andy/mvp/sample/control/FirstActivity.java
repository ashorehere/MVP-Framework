package com.andy.mvp.sample.control;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.andy.mvp.R;
import com.andy.mvp.lib.control.BaseFragmentActivity;
import com.andy.mvp.sample.presenter.APresenter;
import com.andy.mvp.sample.view.AView;

/**
 * Created by andy on 2018/7/27.
 */

public class FirstActivity extends BaseFragmentActivity implements AView {
    TextView text;
    APresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        text = (TextView) findViewById(R.id.text);
        //初始化Presenter
        presenter = new APresenter();
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
    public void getDataBuy(View view) {
        presenter.getDataBuy("Buy");
    }

    // button 点击事件调用方法
    public void getDataSell(View view) {
        presenter.getDataSell("Sell");
    }


    @Override
    public void showDataBuy(String data) {
        text.setText(data);
    }


    @Override
    public void showDataSell(String data) {
        text.setText(data);
    }

}
