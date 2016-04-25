package com.example.stpan.daggerdemo.main;

import com.example.stpan.daggerdemo.main.MainActivity;
import com.example.stpan.daggerdemo.entity.People;
import com.example.stpan.daggerdemo.entity.Student;

import javax.inject.Inject;
import javax.xml.transform.Source;

/**
 * 功能：
 * 创建时间:2016/3/15 : 16:03
 * 作者:pst
 */
public class MainActivityPresenter implements MainContract.present{
    private MainContract.view mainView;

    @Inject
    public MainActivityPresenter(MainContract.view mainView) {
        System.out.println("hello presenter ");
        this.mainView = mainView;
    }

    @Override
    public void testPresent() {
        System.out.println("testPresent");
        mainView.testView();
    }
}
