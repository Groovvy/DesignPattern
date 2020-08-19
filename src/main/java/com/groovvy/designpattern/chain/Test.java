package com.groovvy.designpattern.chain;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Test {
    public static void main(String[] args) {
        ShowerHandler showerHandler = new ShowerHandler();
        EatHanlder eatHanlder = new EatHanlder();
        SleepHanlder sleepHanlder = new SleepHanlder();
        showerHandler.setNext(eatHanlder);
        eatHanlder.setNext(sleepHanlder);
        showerHandler.handle();
    }
}
