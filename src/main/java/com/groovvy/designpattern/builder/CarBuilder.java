package com.groovvy.designpattern.builder;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class CarBuilder {

    private Car car = new Car();

    public CarBuilder addHead(String color){
        car.setHead(color);
        return this;
    }

    public CarBuilder addBody(String color){
        car.setBody(color);
        return this;
    }

    public CarBuilder addWheel(int count){
        car.setWheel(count);
        return this;
    }

    public CarBuilder addDoor(int count){
        car.setDoor(count);
        return this;
    }

    public Car build(){
        return this.car;
    }

}
