package com.groovvy.designpattern.factory.simplefactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class ApplePhone implements IPhone {

    @Override
    public void show() {
        System.out.println("苹果手机");
    }
}
