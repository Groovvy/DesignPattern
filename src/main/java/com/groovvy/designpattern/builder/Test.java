package com.groovvy.designpattern.builder;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.addHead("黑色")
                            .addBody("白色")
                            .addDoor(4)
                            .addWheel(4)
                            .build();
        System.out.println(car);
    }
}
