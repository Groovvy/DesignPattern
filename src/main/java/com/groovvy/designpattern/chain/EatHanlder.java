package com.groovvy.designpattern.chain;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class EatHanlder extends AbstractHandler {
    @Override
    public void handle() {
        System.out.println("再吃饭");
        chain.handle();
    }
}
