package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public abstract class AbstractDecorator extends AbstractHouse {

    private AbstractHouse house;

    public AbstractDecorator(AbstractHouse house) {
        this.house = house;
    }

    @Override
    public void showWall() {
        this.house.showWall();
    }

    @Override
    public void showDoor() {
        this.house.showDoor();
    }

    @Override
    public void showFloor() {
        this.house.showFloor();
    }
}
