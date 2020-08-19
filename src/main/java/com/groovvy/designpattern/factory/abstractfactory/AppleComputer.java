package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class AppleComputer implements IComputer {
    @Override
    public void show() {
        System.out.println("苹果笔记本");
    }
}
