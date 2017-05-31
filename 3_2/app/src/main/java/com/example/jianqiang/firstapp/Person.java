package com.example.jianqiang.firstapp;

import android.content.Context;
import android.util.Log;

public class Person {
    public Person() {
        Log.i("dagger","person create!!!");
    }

    public Person(String name) {
        Log.i("dagger", name);
    }
}