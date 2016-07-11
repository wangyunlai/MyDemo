package com.wyl.myademo.tools;

import android.util.Log;

/**
 * Created by dllo on 16/7/11.
 * log
 */
public final class L {
    //被final修饰不能被继承
    //私有构造放法,外部不能创建对象
    private L() {
    }

    //调试模式  目前自定义为ture
    private static boolean isDebug = true;
    //TAG  log日志的标签 定义是应用名
    private static String TAG = "MyDemo";

    public static void e(String msg) {

        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void d(String msg) {

        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void w(String msg) {

        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void i(String msg) {

        if (isDebug) {
            Log.e(TAG, msg);
        }
    }


    /**
     * 使用自定义TAG标签
     *
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

}
