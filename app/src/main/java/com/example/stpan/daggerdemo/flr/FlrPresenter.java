package com.example.stpan.daggerdemo.flr;

import javax.inject.Inject;

/**
 * 功能：
 * 创建时间:2016/4/25 : 17:09
 * 作者:pst
 * 版权: sowell
 */
public class FlrPresenter implements FlrContract.presenter{
    private FlrContract.view flrView;

    @Inject
    public FlrPresenter(FlrContract.view flrView) {
        this.flrView = flrView;
    }

    @Override
    public void test() {
        System.out.println("FlrPresenter test");
        flrView.test();
    }
}
