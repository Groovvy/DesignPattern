package com.groovvy.designpattern.singleton.hungry;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {
    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
