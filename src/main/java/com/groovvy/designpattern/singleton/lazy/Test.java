package com.groovvy.designpattern.singleton.lazy;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();

    }
}
