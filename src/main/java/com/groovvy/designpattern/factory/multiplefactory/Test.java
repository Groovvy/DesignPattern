package com.groovvy.designpattern.factory.multiplefactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {

    public static void main(String[] args) {
        //简单工厂 随着业务的扩大，有点趋向于万能工厂，不便于维护

        //工厂方法  对工厂本身作抽象，每种产品实现一种工厂来创建对象
        IPhoneFactory factory1 = new AppleFactory();
        IPhone phone1 = factory1.createPhone();
        phone1.show();

        IPhoneFactory factory2 = new OppoFactory();
        IPhone phone2 = factory2.createPhone();
        phone2.show();
    }
}
