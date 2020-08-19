package com.groovvy.designpattern.chain;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class SleepHanlder extends AbstractHandler {
    @Override
    public void handle() {
        System.out.println("最后睡觉");
    }
}
