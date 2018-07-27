package com.andy.mvp.sample.presenter;

import com.andy.mvp.lib.presenter.BasePresenter;
import com.andy.mvp.sample.view.CView;

/**
 * Created by andy on 2018/7/27.
 */

public class CPresenter extends BasePresenter<CView> {
    APresenter aPresenter;
    BPresenter bPresenter;

    public CPresenter() {
        aPresenter = new APresenter();
        bPresenter = new BPresenter();
    }

    @Override
    public void attachView(CView mvpView) {
        super.attachView(mvpView);
        aPresenter.attachView(mvpView);
        bPresenter.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        aPresenter.detachView();
        bPresenter.detachView();
    }

    /**
     * BuyAndPlay 获取网络数据
     * @param params 参数
     */
    public void getDataBuyAndPlay(String params){
        aPresenter.getDataBuy(params);
        bPresenter.getDataPlay(params);
    }

    /**
     * SellAndStop 获取网络数据
     * @param params 参数
     */
    public void getDataSellAndStop(String params){
        aPresenter.getDataSell(params);
        bPresenter.getDataStop(params);
    }
}
