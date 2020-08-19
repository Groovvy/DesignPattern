package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class AppleGiftFactory extends GiftFactory {
    @Override
    IPhone getPhone() {
        super.init();
        return new ApplePhone();
    }

    @Override
    IComputer getComputer() {
        super.init();
        return new AppleComputer();
    }
}
