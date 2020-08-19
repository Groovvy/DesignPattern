package com.groovvy.designpattern.singleton.inner;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class InnerSingleton {

    private InnerSingleton(){};

    public static final InnerSingleton getInstance(){
        return InnerSingleLoadder.instance;
    }

    private static class InnerSingleLoadder{
        private static final InnerSingleton instance = new InnerSingleton();
    }

}
