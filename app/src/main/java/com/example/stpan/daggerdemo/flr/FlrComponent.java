package com.example.stpan.daggerdemo.flr;

import com.example.stpan.daggerdemo.ApplicationComponent;
import com.example.stpan.daggerdemo.di.PerFragment;

import javax.inject.Inject;

import dagger.Component;

/**
 * 功能：
 * 创建时间:2016/4/25 : 17:08
 * 作者:pst
 * 版权: sowell
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class,modules = FlrModule.class)
public interface FlrComponent {
    void Inject(FlrFragment flrFragment);
}
