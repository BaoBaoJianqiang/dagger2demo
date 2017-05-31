package com.example.jianqiang.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class MainActivity extends Activity {

    @PersonWithNoParams
    @Inject
    Lazy<Person> lazyPerson;

    @PersonWithName
    @Inject
    Provider<Person> person_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();

        //注入
        component.inject(this);

        //需要时才创建，但每次都一样
        Person person1 = lazyPerson.get();
        Person person2 = lazyPerson.get();
        Person person3 = lazyPerson.get();

        //需要时才创建，但每次都不一样
        Person person4 = person_2.get();
        Person person5 = person_2.get();
        Person person6 = person_2.get();
        Person person7 = person_2.get();
    }
}
