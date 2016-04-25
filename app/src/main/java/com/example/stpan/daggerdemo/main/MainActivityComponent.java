package com.example.stpan.daggerdemo.main;

import com.example.stpan.daggerdemo.ApplicationComponent;
import com.example.stpan.daggerdemo.di.PerActivity;

import dagger.Component;

/**
 * 功能：
 * 创建时间:2016/4/25 : 14:26
 * 作者:pst
 * 版权: sowell
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
    MainContract.view getMainContract();
}
