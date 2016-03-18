package com.example.stpan.daggerdemo.component;

import com.example.stpan.daggerdemo.ui.MainActivity;
import com.example.stpan.daggerdemo.module.MainActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 功能：
 * 创建时间:2016/3/15 : 15:15
 * 作者:pst
 */
@Singleton
@Component(modules = {MainActivityModule.class})
public interface TestComponent {
    MainActivity inject(MainActivity mainActivity);
}
