package com.example.jianqiang.firstapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module   //提供依赖对象的实例
public class MainModule {

    @Provides  // 关键字，标明该方法提供依赖对象
    Person providerPerson(){
        //提供Person对象
        return new Person();
    }

    //没有@Provides,就去Person2的构造函数中查找
    Person2 providerPerson2(){
        //提供Person2对象
        return new Person2();
    }
}