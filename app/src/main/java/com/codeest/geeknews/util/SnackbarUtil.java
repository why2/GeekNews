package com.codeest.geeknews.util;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by codeest on 16/9/3.
 * SnackBar 封装
 */

public class SnackbarUtil {
    
    /**
     * 长时间
     * @param view
     * @param msg
     */
    public static void show(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }
    
    /**
     * 短时间
     * @param view
     * @param msg
     */
    public static void showShort(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }
}
