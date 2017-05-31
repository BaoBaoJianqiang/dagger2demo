package com.example.jianqiang.firstapp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier  // 关键词
@Retention(RetentionPolicy.RUNTIME)  // 运行时仍可用
public @interface PersonWithName {

}