package com.example.stpan.daggerdemo.main;

import dagger.Module;
import dagger.Provides;

/**
 * 功能：
 * 创建时间:2016/3/15 : 15:55
 * 作者:pst
 */
@Module
public class MainActivityModule {
    private final MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainContract.view provideMainContractView(){
        return mainActivity;
    }

    /*@Provides
    MainActivityPresenter provideMainFragmentPresenter(MainContract.view view){
        return new MainActivityPresenter(view);
    }*/
}
