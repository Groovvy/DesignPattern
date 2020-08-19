package com.groovvy.designpattern.adapter;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class PowerAdapter extends AC220 implements DC5 {

    @Override
    public int getDC5Power() {
        return super.getAC220Power()/44;
    }
}
