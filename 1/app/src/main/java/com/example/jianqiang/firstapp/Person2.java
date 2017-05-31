package com.example.jianqiang.firstapp;

import android.util.Log;

import javax.inject.Inject;

public class Person2 {

    @Inject
    public Person2() {
        Log.i("dagger","person2 create!!!");
    }
}