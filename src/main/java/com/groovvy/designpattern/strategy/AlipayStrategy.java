package com.groovvy.designpattern.strategy;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class AlipayStrategy implements IPay {
    @Override
    public void pay() {
        System.out.println("使用支付宝支付");
    }
}
