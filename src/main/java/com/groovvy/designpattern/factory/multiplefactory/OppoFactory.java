package com.groovvy.designpattern.factory.multiplefactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class OppoFactory implements IPhoneFactory {
    @Override
    public IPhone createPhone() {
        return new OppoPhone();
    }
}
