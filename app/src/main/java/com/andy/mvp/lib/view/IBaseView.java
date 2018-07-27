package com.andy.mvp.lib.view;

import android.content.Context;

/**
 * Created by andy on 2018/7/27.
 */

public interface IBaseView {
    /**
     * 显示正在加载view
     */
    void showLoading();
    /**
     * 关闭正在加载view
     */
    void hideLoading();
    /**
     * 显示提示
     * @param msg
     */
    void showToast(String msg);
    /**
     * 当数据请求异常，调用此接口提示
     */
    void showErrorMessage();
    /**
     * 当数据请求失败后，调用此接口提示
     * @param msg 失败原因
     */
    void showFailureMessage(String msg);
    /**
     * 获取上下文
     * @return 上下文
     */
    Context getContext();
}
