package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class NewHouse extends AbstractHouse {
    @Override
    public void showWall() {
        System.out.println("没装修的墙");
    }

    @Override
    public void showDoor() {
        System.out.println("没有门");
    }

    @Override
    public void showFloor() {
        System.out.println("没装修的地");
    }
}
