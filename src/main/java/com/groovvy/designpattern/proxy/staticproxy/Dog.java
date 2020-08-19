package com.groovvy.designpattern.proxy.staticproxy;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Dog  implements IPerson
{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void lookForLove() {
        System.out.println("我是单身狗"+name+"，我想谈恋爱");
    }
}
