package com.groovvy.designpattern.singleton.inner;


/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        InnerSingleton instance = InnerSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
