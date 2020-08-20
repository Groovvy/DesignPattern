package com.groovvy.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wanghuaan
 * @date 2020/8/20
 **/
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        Teacher t = (Teacher)o;

        System.out.println(this.getName() + "收到"+ t.getName() + "发布" + String.valueOf(arg) +"作业");
    }
}
