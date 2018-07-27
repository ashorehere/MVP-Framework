package com.andy.mvp.sample.presenter;

import com.andy.mvp.lib.model.MvpCallback;
import com.andy.mvp.lib.model.MvpModel;
import com.andy.mvp.lib.presenter.BasePresenter;
import com.andy.mvp.lib.view.MvpView;
import com.andy.mvp.sample.view.AView;

/**
 * Created by andy on 2018/7/27.
 */

public class APresenter extends BasePresenter<AView> {
    /**
     * Buy 获取网络数据
     * @param params 参数
     */
    public void getDataBuy(String params){
        if (!isViewAttached()){
            //如果没有View引用就不加载数据
            return;
        }
        //显示正在加载进度条
        getView().showLoading();
        // 调用Model请求数据
        MvpModel.getNetData(params, new MvpCallback<String>() {
            @Override
            public void onSuccess(String data) {
                //调用view接口显示数据
                if(isViewAttached()){
                    getView().showDataBuy(data);
                }
            }
            @Override
            public void onFailure(String msg) {
                //调用view接口提示失败信息
                if(isViewAttached()){
                    getView().showFailureMessage(msg);
                }
            }
            @Override
            public void onError() {
                //调用view接口提示请求异常
                if(isViewAttached()){
                    getView().showErrorMessage();
                }
            }
            @Override
            public void onComplete() {
                // 隐藏正在加载进度条
                if(isViewAttached()){
                    getView().hideLoading();
                }
            }
        });
    }

    /**
     * Sell 获取网络数据
     * @param params 参数
     */
    public void getDataSell(String params){
        if (!isViewAttached()){
            //如果没有View引用就不加载数据
            return;
        }
        //显示正在加载进度条
        getView().showLoading();
        // 调用Model请求数据
        MvpModel.getNetData(params, new MvpCallback<String>() {
            @Override
            public void onSuccess(String data) {
                //调用view接口显示数据
                if(isViewAttached()){
                    getView().showDataSell(data);
                }
            }
            @Override
            public void onFailure(String msg) {
                //调用view接口提示失败信息
                if(isViewAttached()){
                    getView().showFailureMessage(msg);
                }
            }
            @Override
            public void onError() {
                //调用view接口提示请求异常
                if(isViewAttached()){
                    getView().showErrorMessage();
                }
            }
            @Override
            public void onComplete() {
                // 隐藏正在加载进度条
                if(isViewAttached()){
                    getView().hideLoading();
                }
            }
        });
    }
}
