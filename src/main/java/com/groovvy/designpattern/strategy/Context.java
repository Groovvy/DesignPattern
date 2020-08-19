package com.groovvy.designpattern.strategy;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Context {

    private IPay iPay;

    public Context(IPay iPay) {
        this.iPay = iPay;
    }

    public void pay(){
        this.iPay.pay();
    }
}
