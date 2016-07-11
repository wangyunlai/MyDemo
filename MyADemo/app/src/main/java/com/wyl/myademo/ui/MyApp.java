package com.wyl.myademo.ui;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/7/11.
 */
public class MyApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    //对外提供get方法
    public static Context getContext() {
        return context;
    }
}
