package com.andy.mvp.sample.control;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.andy.mvp.R;
import com.andy.mvp.lib.control.BaseFragmentActivity;
import com.andy.mvp.lib.presenter.MvpPresenter;
import com.andy.mvp.lib.view.MvpView;

public class MainActivity extends BaseFragmentActivity implements MvpView {
    TextView text;
    MvpPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
        //初始化Presenter
        presenter = new MvpPresenter();
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
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        text.setText(msg);
    }
    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "网络请求数据出现异常", Toast.LENGTH_SHORT).show();
        text.setText("网络请求数据出现异常");
    }

    // button 点击事件调用方法
    public void getData(View view){
        presenter.getData("normal");
    }
    // button 点击事件调用方法
    public void getDataForFailure(View view){
        presenter.getData("failure");
    }
    // button 点击事件调用方法
    public void getDataForError(View view){
        presenter.getData("error");
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    // button 点击事件调用方法
    public void gotoFirstActivity(View view){
        startActivity(new Intent(this, FirstActivity.class));
    }
    // button 点击事件调用方法
    public void gotoSecondActivity(View view){
        startActivity(new Intent(this, SecondActivity.class));
    }
    // button 点击事件调用方法
    public void gotoThirdActivity(View view){
        startActivity(new Intent(this, ThirdActivity.class));
    }


}
