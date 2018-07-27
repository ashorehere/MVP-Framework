package com.andy.mvp.sample.control;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.andy.mvp.R;
import com.andy.mvp.lib.control.BaseFragmentActivity;
import com.andy.mvp.lib.presenter.MvpPresenter;
import com.andy.mvp.lib.view.MvpView;
import com.andy.mvp.sample.presenter.APresenter;
import com.andy.mvp.sample.presenter.BPresenter;
import com.andy.mvp.sample.view.AView;
import com.andy.mvp.sample.view.BView;

/**
 * Created by andy on 2018/7/27.
 */

public class SecondActivity extends BaseFragmentActivity implements BView {
    TextView text;
    BPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView) findViewById(R.id.text);
        //初始化Presenter
        presenter = new BPresenter();
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
    public void getDataPlay(View view) {
        presenter.getDataPlay("Play");
    }

    // button 点击事件调用方法
    public void getDataStop(View view) {
        presenter.getDataStop("Stop");
    }


    @Override
    public void showDataPlay(String data) {
        text.setText(data);
    }


    @Override
    public void showDataStop(String data) {
        text.setText(data);
    }

}
