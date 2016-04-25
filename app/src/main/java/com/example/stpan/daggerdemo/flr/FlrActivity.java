package com.example.stpan.daggerdemo.flr;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.stpan.daggerdemo.ui.R;

/**
 * 功能：
 * 创建时间:2016/4/25 : 16:06
 * 作者:pst
 * 版权: sowell
 */
public class FlrActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flr);
        init();
    }

    private void init() {
        System.out.println("FlrActivity onCreate");
        getSupportFragmentManager().beginTransaction().replace(R.id.fg_act_flr,FlrFragment.newInstance()).commit();
    }
}
