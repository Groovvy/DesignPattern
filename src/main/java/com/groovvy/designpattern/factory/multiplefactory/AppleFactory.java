package com.groovvy.designpattern.factory.multiplefactory;



/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class AppleFactory implements IPhoneFactory {
    @Override
    public IPhone createPhone() {
        return new ApplePhone();
    }
}
