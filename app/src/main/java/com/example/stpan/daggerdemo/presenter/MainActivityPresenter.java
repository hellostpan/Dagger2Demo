package com.example.stpan.daggerdemo.presenter;

import com.example.stpan.daggerdemo.ui.MainActivity;
import com.example.stpan.daggerdemo.entity.People;
import com.example.stpan.daggerdemo.entity.Student;

/**
 * 功能：
 * 创建时间:2016/3/15 : 16:03
 * 作者:pst
 */
public class MainActivityPresenter {
    private MainActivity mainActivity;
    private Student student;
    private People people;

    public MainActivityPresenter(MainActivity mainActivity, Student student, People people) {
        this.mainActivity = mainActivity;
        this.student = student;
        this.people = people;
    }

    public String getIds(){
        return student.getId()+" : "+people.getId();
    }
}
