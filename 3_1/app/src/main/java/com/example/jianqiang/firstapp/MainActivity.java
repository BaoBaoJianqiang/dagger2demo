package com.example.jianqiang.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends Activity {

    @Named("noparams")
    @Inject
    Person person;

    @Named("name")
    @Inject
    Person person_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();

        //注入
        component.inject(this);
    }
}
