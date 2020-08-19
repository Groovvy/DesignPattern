package com.groovvy.designpattern.decorator;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class WallDecorator extends  AbstractDecorator{

    public WallDecorator(AbstractHouse house) {
        super(house);
    }

    @Override
    public void showWall() {
        super.showWall();
        System.out.println("给墙刷上白漆");
    }
}
