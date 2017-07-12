package com.codeest.geeknews.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by codeest on 2016/8/22.
 * 分享文字，图片，邮件封装
 */
public class ShareUtil {
    
    private static final String EMAIL_ADDRESS = "codeest.dev@gmail.com";
    
    /**
     * 分享文字
     *
     * @param context
     * @param text
     * @param title
     */
    public static void shareText(Context context, String text, String title) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        context.startActivity(Intent.createChooser(intent, title));
    }
    
    /**
     * 分享图片
     *
     * @param context
     * @param uri
     * @param title
     */
    public static void shareImage(Context context, Uri uri, String title) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/png");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        context.startActivity(Intent.createChooser(intent, title));
    }
    
    /**
     * 发送邮件
     *
     * @param context
     * @param title
     */
    public static void sendEmail(Context context, String title) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(
                "mailto:" + EMAIL_ADDRESS));
        context.startActivity(Intent.createChooser(intent, title));
    }
}
