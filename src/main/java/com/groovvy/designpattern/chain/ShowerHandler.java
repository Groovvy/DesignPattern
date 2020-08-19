package com.groovvy.designpattern.chain;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class ShowerHandler extends AbstractHandler{
    @Override
    public void handle() {
        System.out.println("先洗澡");
        chain.handle();
    }
}
