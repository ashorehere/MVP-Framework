package com.andy.mvp.lib.view;

/**
 * Created by andy on 2018/7/27.
 */

public interface MvpView extends IBaseView{
    /**
     * 当数据请求成功后，调用此接口显示数据
     * @param data 数据源
     */
    void showData(String data);

}
