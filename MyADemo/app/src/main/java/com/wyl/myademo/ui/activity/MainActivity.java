package com.wyl.myademo.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wyl.myademo.R;
import com.wyl.myademo.tools.L;

public class MainActivity extends AbsBaseActivity implements View.OnClickListener {
    private TextView mainTv;

    /**
     * 写基类的目的
     * 1 规定项目整体的界面风格
     * 2简化代码
     *
     * @return 扩展 注解 butterKnife插件
     */

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
//        mainTv = (TextView) findViewById(R.id.main_tv);
        mainTv = byView(R.id.main_tv);
        L.e("运行了");
    }

    @Override
    protected void initDatas() {
        mainTv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_tv:
                //goTo(this, NextActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("aaa", "ddd");
                bundle.putInt("num", 1212);
                goTo(this, NextActivity.class, bundle);
                break;
        }
    }
}

