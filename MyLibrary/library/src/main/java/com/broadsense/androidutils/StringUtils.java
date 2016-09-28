package com.broadsense.androidutils;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * packageName：com.broadsense.androidutils
 * ProjectName：MyLibrary
 * Description：
 * Author：zhouxian
 * Date：2016/9/28 15:19
 */

public class StringUtils {

    private static class Clickable extends ClickableSpan implements View.OnClickListener {
        private final View.OnClickListener mListener;

        Clickable(View.OnClickListener listener) {
            mListener = listener;
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view);
        }
    }

    /**
     * @param text     文字内容
     * @param start    高亮可以点击部分起始位置
     * @param end      高亮可以点击部分结束位置
     * @param color    高亮颜色
     * @param listener 点击监听
     * @return 带高亮可点击的字符串
     */
    public static SpannableString getClickableSpan(String text, int start, int end, int color, View.OnClickListener listener) {
        SpannableString spanableInfo = new SpannableString(text);
        spanableInfo.setSpan(new Clickable(listener), start, end, Spanned.SPAN_MARK_MARK);//设置部分可以点击
        spanableInfo.setSpan(new ForegroundColorSpan(color),
                start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//设置部分字体颜色
        spanableInfo.setSpan(new UnderlineSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//下划线
        return spanableInfo;
    }

    /**
     * @param str
     * @return 是否为纯数字
     * @throws PatternSyntaxException
     */
    public static boolean isNumber(String str) throws PatternSyntaxException {
        String regEx = "[0-9]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    /*public static float dip2Px(float dip) {
        float density = getResource().getDisplayMetrics().density;
        return dip * density + 0.5f;
    }

    public static int px2Dip(int px) {
        // px/dip = density;
        float density = getResource().getDisplayMetrics().density;
        return (int) (px / density + 0.5f);
    }*/


}
