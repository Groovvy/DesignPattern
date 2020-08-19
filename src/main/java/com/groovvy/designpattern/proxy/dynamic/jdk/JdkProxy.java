package com.groovvy.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class JdkProxy implements InvocationHandler {

    //被代理类
    private Object target;

    //获取代理对象
    public Object getInstance(Object target) throws IllegalAccessException, InstantiationException {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }


    private void before(){
        System.out.println("发布征婚启事");
    }

    private void after(){
        System.out.println("配对");
    }
}
