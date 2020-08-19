package com.groovvy.designpattern.templatemethod;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Test {
    public static void main(String[] args) {

        HolidayMessage holidayMessage = new HolidayMessage("zhangsan","我要请假3天","2020/8/19","groovvy");
        holidayMessage.showMessage();
        System.out.println("=========================");
        LoveMessage loveMessage = new LoveMessage("zyx","我喜欢你","2020/8/19","groovvy");
        loveMessage.showMessage();

    }
}
