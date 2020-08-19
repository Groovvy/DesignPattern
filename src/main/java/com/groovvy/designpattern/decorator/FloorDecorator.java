package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class FloorDecorator extends AbstractDecorator {
    public FloorDecorator(AbstractHouse house) {
        super(house);
    }

    @Override
    public void showFloor() {
        super.showFloor();
        System.out.println("铺上木地板");
    }
}
