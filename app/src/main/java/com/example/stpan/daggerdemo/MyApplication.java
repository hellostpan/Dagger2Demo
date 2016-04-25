package com.example.stpan.daggerdemo;

import android.app.Application;

/**
 * 功能：
 * 创建时间:2016/4/25 : 13:49
 * 作者:pst
 * 版权: sowell
 */
public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init(){
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void test(){
        System.out.println("application test");
    }
}
