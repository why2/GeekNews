package com.codeest.geeknews.base;

/**
 * Created by codeest on 2016/8/2.
 * View基类
 */
public interface BaseView {
    
    /**
     * 错误提示
     * @param msg
     */
    void showErrorMsg(String msg);
    
    /**
     * 是否使用夜间模式
     * @param isNight
     */
    void useNightMode(boolean isNight);

    //=======  State  =======
    
    /**
     * 显示错误状态
     */
    void stateError();
    
    /**
     * 显示空状态
     */
    void stateEmpty();
    
    /**
     * 显示加载状态
     */
    void stateLoading();
    
    /**
     * 从错误状态，加载状态，空状态转换为正常的状态
     */
    void showComment();
}
