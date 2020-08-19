package com.groovvy.designpattern.singleton.enums;

import com.groovvy.designpattern.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class DestroyTest {
    public static void main(String[] args) {
        //反射破坏单例
        try {

            Class clazz = LazySingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
