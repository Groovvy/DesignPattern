package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class OppoPhone implements IPhone {
    @Override
    public void show() {
        System.out.println("oppo手机");
    }
}
