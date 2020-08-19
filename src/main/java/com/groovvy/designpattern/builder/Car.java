package com.groovvy.designpattern.builder;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Car {

    private String head;
    private String body;
    private int wheel;
    private int door;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", wheel=" + wheel +
                ", door=" + door +
                '}';
    }
}
