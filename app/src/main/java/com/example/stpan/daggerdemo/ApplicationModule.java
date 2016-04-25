package com.example.stpan.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 功能：
 * 创建时间:2016/4/25 : 13:51
 * 作者:pst
 * 版权: sowell
 */
@Module
public class ApplicationModule {
    private final MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }


    @Provides @Singleton
    MyApplication provideMyApplication(){
        return application;
    }

    @Provides @Singleton
    public ToastUtil provideToastUtil(){
        return new ToastUtil(application.getApplicationContext());
    }
}
