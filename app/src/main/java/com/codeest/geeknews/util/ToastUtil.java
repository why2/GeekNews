package com.codeest.geeknews.util;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.codeest.geeknews.R;
import com.codeest.geeknews.app.App;

/**
 * Created by codeest on 2016/8/4.
 * toast工具类
 */
public class ToastUtil {
    
    static ToastUtil td;
    Context context;
    Toast toast;
    String msg;
    
    public ToastUtil(Context context) {
        this.context = context;
    }
    
    public static void show(int resId) {
        show(App.getInstance().getString(resId));
    }
    
    /**
     * 创建长时间的toast
     *
     * @param msg
     */
    public static void show(String msg) {
        if (td == null) {
            td = new ToastUtil(App.getInstance());
        }
        td.setText(msg);
        td.create().show();
    }
    
    /**
     * 创建短时间的toast
     *
     * @param msg
     */
    public static void shortShow(String msg) {
        if (td == null) {
            td = new ToastUtil(App.getInstance());
        }
        td.setText(msg);
        td.createShort().show();
    }
    
    /**
     * 创建长时间的toast
     *
     * @return
     */
    public Toast create() {
        View contentView = View.inflate(context, R.layout.dialog_toast, null);
        TextView tvMsg = (TextView) contentView.findViewById(R.id.tv_toast_msg);
        toast = new Toast(context);
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        tvMsg.setText(msg);
        return toast;
    }
    
    /**
     * 创建短时间的toast
     *
     * @return
     */
    public Toast createShort() {
        View contentView = View.inflate(context, R.layout.dialog_toast, null);
        TextView tvMsg = (TextView) contentView.findViewById(R.id.tv_toast_msg);
        toast = new Toast(context);
        toast.setView(contentView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        tvMsg.setText(msg);
        return toast;
    }
    
    /**
     * 再次显示toast
     */
    public void show() {
        if (toast != null) {
            toast.show();
        }
    }
    
    public void setText(String text) {
        msg = text;
    }
}
