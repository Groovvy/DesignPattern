package com.groovvy.designpattern.factory.simplefactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {
    public static void main(String[] args) {
        IPhone phone1 = PhoneFactory.createPhone(ApplePhone.class);
        phone1.show();
        IPhone phone2 = PhoneFactory.createPhone(OppoPhone.class);
        phone2.show();
    }
}
