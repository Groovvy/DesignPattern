package com.groovvy.designpattern.observer;

/**
 * @author wanghuaan
 * @date 2020/8/20
 **/
public class Test {
    public static void main(String[] args) {

        Teacher t = new Teacher("groovvy");

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        t.addObserver(s1);
        t.addObserver(s2);
        t.addHomeWork("数学");

    }
}
