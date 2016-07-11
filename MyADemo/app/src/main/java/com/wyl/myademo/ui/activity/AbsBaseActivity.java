package com.wyl.myademo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by dllo on 16/7/11.
 * 抽象的Activity基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在setContentView上方 去掉信息栏
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //加入一些进入退出的动画
//        overridePendingTransition();

        //绑定布局
        setContentView(setLayout());
        //定制流程
        //1 初始化组件
        initViews();
        //2 初始化数据
        initDatas();

    }

    /**
     * 设置xml布局文件
     *
     * @return
     */

    protected abstract int setLayout();
    //子类同包可用 返回值int类型 R.Layout.aty_main


    /**
     * 初始化组件
     */

    protected abstract void initViews();

    /**
     * 初始化数据
     */
    protected abstract void initDatas();

    /**
     * 简化findviewbyid
     * T泛型 泛指一系列类型 T是view的子类
     */
    protected <T extends View> T byView(int resId) {
        T t = (T) findViewById(resId);
        return t;
    }

    /**
     * 简化intent的跳转
     *
     * @param from intent xx.this
     * @param to   xx.class
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to) {
        Intent intent = new Intent(from, to);
        startActivity(intent);

    }

    /**
     * 隐式intent调用系统功能
     *
     * @param action
     * @param uri
     */

    protected void goTo(String action, Uri uri) {
        Intent intent = new Intent(action);
        intent.setData(Uri.parse("asda"));
        startActivity(intent);
    }

    /**
     * 代值跳转
     *
     * @param from
     * @param to
     * @param values Bundle类型的值
     *               Bundle一个轻量级的存储类 key _ value
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to, Bundle values) {
        Intent intent = new Intent(from, to);
        intent.putExtras(values);
        startActivity(intent);
    }
}
