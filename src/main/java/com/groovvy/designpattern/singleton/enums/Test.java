package com.groovvy.designpattern.singleton.enums;

import java.lang.reflect.Constructor;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class Test {
    public static void main(String[] args) {

        EnumSingleton s1 = EnumSingleton.getInstance();
        s1.setData(new Object());
        EnumSingleton s2 = EnumSingleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.getData() == s2.getData());

        try {
            //反射无法破坏
            Class clazz = EnumSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            Object o = constructor.newInstance("a","1");
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
