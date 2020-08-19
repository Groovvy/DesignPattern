package com.groovvy.designpattern.proxy.dynamic.cglib;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        TuHao tuHao = (TuHao) cglibProxy.getInstance(TuHao.class);
        tuHao.lookForLove();
    }
}
