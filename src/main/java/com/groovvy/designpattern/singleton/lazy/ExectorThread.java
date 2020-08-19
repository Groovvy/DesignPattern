package com.groovvy.designpattern.singleton.lazy;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
