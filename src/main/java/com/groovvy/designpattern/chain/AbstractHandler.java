package com.groovvy.designpattern.chain;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public abstract class AbstractHandler {

    protected AbstractHandler chain;

    public void setNext(AbstractHandler handler){
        this.chain = handler;
    }

    public abstract void handle();
}
