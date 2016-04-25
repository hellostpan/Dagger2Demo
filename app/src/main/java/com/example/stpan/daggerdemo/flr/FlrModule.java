package com.example.stpan.daggerdemo.flr;

import dagger.Module;
import dagger.Provides;

/**
 * 功能：
 * 创建时间:2016/4/25 : 17:07
 * 作者:pst
 * 版权: sowell
 */
@Module
public class FlrModule {
    private final FlrFragment fragment;

    public FlrModule(FlrFragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    FlrContract.view provideFlrContractView(){
        return fragment;
    }

}
