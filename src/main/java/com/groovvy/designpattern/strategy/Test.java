package com.groovvy.designpattern.strategy;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("========淘宝商城=========");
        Context context = new Context(new AlipayStrategy());
        context.pay();

        System.out.println("========京东商城=========");
        context = new Context(new WechatStrategy());
        context.pay();

    }
}
