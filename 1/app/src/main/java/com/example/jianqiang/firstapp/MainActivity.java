package com.example.jianqiang.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import dagger.Lazy;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    Person person;

    @Inject
    Person person_2;

    @Inject
    Person2 person2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();

        //注入
        component.inject(this);

        // 打印两个对象的地址
        Log.i("dagger","person = "+ person.toString()+"; person2 = "+ person_2.toString());
    }
}
