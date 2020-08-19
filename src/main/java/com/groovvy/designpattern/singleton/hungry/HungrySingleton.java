package com.groovvy.designpattern.singleton.hungry;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }

}
