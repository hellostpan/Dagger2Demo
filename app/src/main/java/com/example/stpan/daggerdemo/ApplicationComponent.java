package com.example.stpan.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 功能：
 * 创建时间:2016/4/25 : 14:29
 * 作者:pst
 * 版权: sowell
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    MyApplication getMyApplication();
    ToastUtil getToastUtil();
}
