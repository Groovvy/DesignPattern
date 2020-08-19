package com.groovvy.designpattern.proxy.staticproxy;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Proxy implements IPerson{

    private Dog dog;

    public Proxy(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void lookForLove() {
        before();
        dog.lookForLove();
        after();
    }

    private void before(){
        System.out.println("发布征婚启事");
    }

    private void after(){
        System.out.println("配对");
    }
}
