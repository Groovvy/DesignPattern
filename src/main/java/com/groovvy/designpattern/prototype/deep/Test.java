package com.groovvy.designpattern.prototype.deep;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Classroom classroom = new Classroom();
        classroom.setValue("groovvy");

        Classroom classroom1 = (Classroom) classroom.clone();
        classroom1.setValue("groovvy1");
        System.out.println(classroom.getValue());
        System.out.println(classroom1.getValue());

    }
}
