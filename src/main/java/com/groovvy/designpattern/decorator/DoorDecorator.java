package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class DoorDecorator extends AbstractDecorator {
    public DoorDecorator(AbstractHouse house) {
        super(house);
    }

    @Override
    public void showDoor() {
        super.showDoor();
        System.out.println("装上一个防盗门");
    }
}
