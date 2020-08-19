package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) {
        AbstractHouse newHouse;
        newHouse = new NewHouse();
        System.out.println("=======装修门============");
        newHouse = new DoorDecorator(newHouse);
        newHouse.showDoor();
        newHouse.showFloor();
        newHouse.showWall();
        System.out.println("=======装修地板============");
        newHouse = new FloorDecorator(newHouse);
        newHouse.showDoor();
        newHouse.showFloor();
        newHouse.showWall();
        System.out.println("=======装修墙============");
        newHouse = new WallDecorator(newHouse);
        newHouse.showDoor();
        newHouse.showFloor();
        newHouse.showWall();


    }
}
