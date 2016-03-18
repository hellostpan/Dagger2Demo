package com.example.stpan.daggerdemo.module;

import com.example.stpan.daggerdemo.ui.MainActivity;
import com.example.stpan.daggerdemo.entity.People;
import com.example.stpan.daggerdemo.entity.Student;
import com.example.stpan.daggerdemo.presenter.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 功能：
 * 创建时间:2016/3/15 : 15:55
 * 作者:pst
 */
@Module
public class MainActivityModule {
    MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    Student provideStudent() {
        return new Student("1","2","3");
    }

    @Provides
    People providePeople() {
        return new People("4","5","6");
    }

    @Singleton
    @Provides
    MainActivityPresenter mainActivityPresenter(MainActivity mainActivity,Student student,People people){
        return  new MainActivityPresenter(mainActivity,student,people);
    }
}
