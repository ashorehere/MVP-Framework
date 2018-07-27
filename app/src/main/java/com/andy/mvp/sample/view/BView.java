package com.andy.mvp.sample.view;

import com.andy.mvp.lib.view.IBaseView;

/**
 * Created by andy on 2018/7/27.
 */

public interface BView extends IBaseView {
    /**
     * operation Play
     * @param data 数据源
     */
    void showDataPlay(String data);
    /**
     * operation Stop
     * @param data 数据源
     */
    void showDataStop(String data);

}
