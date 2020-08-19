package com.groovvy.designpattern.strategy;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class WechatStrategy implements IPay {
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
