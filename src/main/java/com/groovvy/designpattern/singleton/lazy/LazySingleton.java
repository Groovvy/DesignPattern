package com.groovvy.designpattern.singleton.lazy;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class LazySingleton {

    private static  LazySingleton instance = null;

    private LazySingleton(){};

     public static LazySingleton getInstance(){
         if(instance == null){
             synchronized(LazySingleton.class){
                 if(instance == null){
                     instance = new LazySingleton();
                 }
             }
         }
        return instance;
    }
}
