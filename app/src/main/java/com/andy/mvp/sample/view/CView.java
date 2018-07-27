package com.andy.mvp.sample.view;

import com.andy.mvp.lib.view.IBaseView;

/**
 * Created by andy on 2018/7/27.
 */

public interface CView extends AView, BView {
    /**
     * operation BuyAndPlay
     * @param data 数据源
     */
    void showDataBuyAndPlay(String data);
    /**
     * operation SellAndStop
     * @param data 数据源
     */
    void showDataSellAndStop(String data);

}
