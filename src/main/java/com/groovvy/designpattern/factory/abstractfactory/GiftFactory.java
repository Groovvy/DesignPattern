package com.groovvy.designpattern.factory.abstractfactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/

public abstract class GiftFactory {

    public void init(){
        System.out.println("准备礼包盒子");
    }
    abstract IPhone getPhone();
    abstract IComputer getComputer();
}
