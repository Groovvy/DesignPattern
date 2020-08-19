package com.groovvy.designpattern.proxy.staticproxy;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Dog("zhangsan"));
        proxy.lookForLove();
    }
}
