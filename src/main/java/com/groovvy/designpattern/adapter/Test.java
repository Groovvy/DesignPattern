package com.groovvy.designpattern.adapter;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println(dc5.getDC5Power());
    }
}
