package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class OppoGiftFactory extends GiftFactory {
    @Override
    IPhone getPhone() {
        super.init();
        return new OppoPhone();
    }

    @Override
    IComputer getComputer() {
        super.init();
        return new OppoComputer();
    }
}
