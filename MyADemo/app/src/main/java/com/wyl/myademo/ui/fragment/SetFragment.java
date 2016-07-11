package com.wyl.myademo.ui.fragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wyl.myademo.R;
import com.wyl.myademo.ui.activity.MainActivity;

/**
 * Created by dllo on 16/7/11.
 * 创建fragment使用基类
 */
public class SetFragment extends AbsBaseFragment implements View.OnClickListener {
    private TextView textView;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;

    }

    @Override
    protected void initViews() {
        textView = byView(R.id.main_tv);

        Toast.makeText(context, "--", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initDatas() {
        textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_tv:
                jump(context,MainActivity.class);
                break;
        }
    }
}
