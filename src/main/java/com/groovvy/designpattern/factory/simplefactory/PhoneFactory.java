package com.groovvy.designpattern.factory.simplefactory;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public class PhoneFactory {

    public static <T extends IPhone> T createPhone(Class<T> clazz){
        try {
            T phone = clazz.newInstance();
            return (T)phone;
        }catch ( InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }
}
