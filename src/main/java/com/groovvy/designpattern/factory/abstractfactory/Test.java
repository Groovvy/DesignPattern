package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {
    public static void main(String[] args) {
        GiftFactory giftFactory = new AppleGiftFactory();
        giftFactory.getPhone().show();
        giftFactory.getComputer().show();


        GiftFactory giftFactory2 = new OppoGiftFactory();
        giftFactory2.getPhone().show();
        giftFactory2.getComputer().show();




    }
}
