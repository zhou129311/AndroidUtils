package com.broadsense.androidutils;

import android.content.Context;
import android.widget.Toast;

/**
 * packageName：com.broadsense.androidutils
 * ProjectName：MyLibrary
 * Description：全局唯一的Toast工具类
 * Author：zhouxian
 * Date：2016/9/28 14:07
 */

public class ToastUtils {
    private static Toast mToast;

    /**
     * show ShortTime Toast
     * @param context this context is ContextImpl
     * @param resId String resId
     */
    private static void showShortToast(Context context, int resId){
        String text = context.getString(resId);
        if(mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    /**
     * show ShortTime Toast
     * @param context this context is ContextImpl
     * @param text Toast content
     */
    public static void showShortToast(Context context, String text) {
        if(mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    /**
     * show LongTime Toast
     * @param context this context is ContextImpl
     * @param text Toast content
     */
    public static void showLongToast(Context context, String text) {
        if(mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_LONG);
        }
        mToast.show();
    }

    /**
     * show LongTime Toast
     * @param context this context is ContextImpl
     * @param resId String resId
     */
    public static void showLongToast(Context context, int resId) {
        String text = context.getString(resId);
        if(mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_LONG);
        }
        mToast.show();
    }


}
