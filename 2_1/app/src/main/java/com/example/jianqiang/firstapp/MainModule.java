package com.example.jianqiang.firstapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module   //提供依赖对象的实例
public class MainModule {

    @Singleton
    @Provides  // 关键字，标明该方法提供依赖对象
    Person providerPerson(){
        //提供Person对象
        return new Person();
    }
}