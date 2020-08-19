package com.groovvy.designpattern.prototype.shallow;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class SysUser implements Cloneable {

    private String name;

    private int age;

    public SysUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
