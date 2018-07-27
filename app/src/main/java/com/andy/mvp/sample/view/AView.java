package com.andy.mvp.sample.view;

import com.andy.mvp.lib.view.IBaseView;

/**
 * Created by andy on 2018/7/27.
 */

public interface AView extends IBaseView {
    /**
     * operation Buy
     * @param data 数据源
     */
    void showDataBuy(String data);
    /**
     * operation Sell
     * @param data 数据源
     */
    void showDataSell(String data);

}
