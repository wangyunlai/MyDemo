package com.wyl.myademo.tools;

import android.widget.Toast;

import com.wyl.myademo.ui.MyApp;

/**
 * Created by dllo on 16/7/11.
 * toast
 */
public class T {
    private static boolean isDebug = true;

    public static void longMsg(String msg) {

        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }

    public static void shortMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }

}
