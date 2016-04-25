package com.example.stpan.daggerdemo.flr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stpan.daggerdemo.ApplicationComponent;
import com.example.stpan.daggerdemo.MyApplication;
import com.example.stpan.daggerdemo.ToastUtil;
import com.example.stpan.daggerdemo.ui.R;

import javax.inject.Inject;

import dagger.Provides;

public class FlrFragment extends Fragment implements FlrContract.view {
    @Inject
    FlrPresenter presenter;
    @Inject
    MyApplication myApplication;
    @Inject
    ToastUtil toastUtil;
    public static FlrFragment newInstance() {
        FlrFragment fragment = new FlrFragment();
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyApplication application = (MyApplication)getActivity().getApplication();
        DaggerFlrComponent.builder()
                .applicationComponent(application.getApplicationComponent())
                .flrModule(new FlrModule(this))
                .build().Inject(this);
        System.out.println(presenter==null);
        presenter.test();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flr,container,false);
        return view;

    }

    @Override
    public void test() {
        System.out.println("FlrFragment test");
    }
}
