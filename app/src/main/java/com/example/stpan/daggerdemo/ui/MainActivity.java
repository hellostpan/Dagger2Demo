package com.example.stpan.daggerdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.stpan.daggerdemo.component.DaggerTestComponent;
import com.example.stpan.daggerdemo.component.TestComponent;
import com.example.stpan.daggerdemo.entity.People;
import com.example.stpan.daggerdemo.entity.Student;
import com.example.stpan.daggerdemo.module.MainActivityModule;
import com.example.stpan.daggerdemo.presenter.MainActivityPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @Inject Student student;
    @Inject People people;
    @Inject MainActivityPresenter mainActivityPresenter;
    @Inject MainActivityPresenter mainActivityPresenter1;
    @Inject MainActivityPresenter mainActivityPresenter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        TestComponent testComponent = DaggerTestComponent.builder().mainActivityModule(new MainActivityModule(this)).build();
        testComponent.inject(this);
        if (student==null){
            Log.d(TAG,"student is null");
        }else {
            Log.d(TAG,student.getId());
        }

        if (people==null){
            Log.d(TAG,"people is null");
        }else {
            Log.d(TAG,people.getId());
        }

        if (mainActivityPresenter==null){
            Log.d(TAG,"mainActivityPresenter is null");
        }else {
            Log.d(TAG,mainActivityPresenter.getIds());
        }

        System.out.println(mainActivityPresenter==mainActivityPresenter1);
        System.out.println(mainActivityPresenter==mainActivityPresenter2);
        System.out.println(mainActivityPresenter1==mainActivityPresenter2);
    }
}
