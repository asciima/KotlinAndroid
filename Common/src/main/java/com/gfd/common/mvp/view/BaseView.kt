package com.gfd.common.mvp.view


/**
 * @Author : 郭富东
 * @Date ：2018/8/1 - 16:19
 * @Email：878749089@qq.com
 * @description：
 */
interface BaseView {

    /**
     * 显示Loading
     */
    fun showLoading()

    /**
     * 隐藏Loading
     */
    fun showContent()

    /**
     * 访问错误
     */
    fun error(){}

    /**
     * 空数据
     */
    fun empty(){}
}