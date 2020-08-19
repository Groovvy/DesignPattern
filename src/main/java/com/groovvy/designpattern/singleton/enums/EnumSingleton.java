package com.groovvy.designpattern.singleton.enums;

/**
 * @author wanghuaan
 * @date 2020/8/17
 **/
public enum EnumSingleton {
    //一个实例
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
