package com.example.stpan.daggerdemo.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.stpan.daggerdemo.ApplicationComponent;
import com.example.stpan.daggerdemo.MyApplication;
import com.example.stpan.daggerdemo.ToastUtil;
import com.example.stpan.daggerdemo.flr.FlrActivity;
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
        setTitle("MainActivity");
        ApplicationComponent application = ((MyApplication)getApplication()).getApplicationComponent();
        System.out.println(application==null);
        DaggerMainActivityComponent.builder().applicationComponent(application)
                .mainActivityModule(new MainActivityModule(this)).build().inject(this);
        Intent intent = new Intent(MainActivity.this,FlrActivity.class);
        startActivity(intent);
    }

    @Override
    public void testView() {

    }
}
