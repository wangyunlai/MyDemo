package com.wyl.myademo.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wyl.myademo.ui.activity.AbsBaseActivity;


/**
 * Created by dllo on 16/7/11.
 */
public abstract class AbsBaseFragment extends Fragment {
    protected Context context;
    //getActivity或者getActivity

    /**
     * 当activity和fragment关联时会被调用
     *
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //当activity和fragment关联时会被调用 传入一个Context给你使用
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(setLayout(), container, false);
    }

    /**
     * 绑定布局
     *
     * @return
     */

    protected abstract int setLayout();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    /**
     * 初始化组件
     */
    protected abstract void initViews();

    //简化findviewbyid
    protected <T extends View> T byView(int resId) {
        return (T) getView().findViewById(resId);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDatas();
    }

    protected abstract void initDatas();

    protected void jump(Context from, Class<? extends AbsBaseActivity> to) {
        Intent intent = new Intent(from, to);
        context.startActivity(intent);
    }
}
