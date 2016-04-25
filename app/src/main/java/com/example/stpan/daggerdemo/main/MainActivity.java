package com.example.stpan.daggerdemo.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.stpan.daggerdemo.ApplicationComponent;
import com.example.stpan.daggerdemo.MyApplication;
import com.example.stpan.daggerdemo.ToastUtil;
import com.example.stpan.daggerdemo.ui.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.view{
    private final String TAG = "MainActivity";
    @Inject
    MainActivityPresenter presenter;
    @Inject
    MyApplication myApplication;
    @Inject
    ToastUtil toastUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        ApplicationComponent application = ((MyApplication)getApplication()).getApplicationComponent();
        System.out.println(application==null);
        DaggerMainActivityComponent.builder().applicationComponent(application)
                .mainActivityModule(new MainActivityModule(this)).build().inject(this);
        presenter.testPresent();
        myApplication.test();
        toastUtil.showToast("hello world");
    }

    @Override
    public void testView() {
        System.out.println("testView()");
    }
}
