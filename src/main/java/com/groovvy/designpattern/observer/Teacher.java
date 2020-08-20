package com.groovvy.designpattern.observer;

import java.util.Observable;

/**
 * @author wanghuaan
 * @date 2020/8/20
 **/
public class Teacher extends Observable {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHomeWork(String subject){
        setChanged();
        System.out.println(this.getName() + "布置" + subject + "作业");
        notifyObservers(subject);
    }


}
