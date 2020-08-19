package com.groovvy.designpattern.templatemethod;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class LoveMessage extends AbstractMessage {

    public LoveMessage(String to, String content, String date, String from) {
        super(to, content, date, from);
    }

    @Override
    public void writeHead() {
        System.out.println("写给"+this.getTo()+"的情书");
    }

    @Override
    public void writeTail() {
        System.out.println("❤❤❤"+"日期:"+this.getDate());
        System.out.println("署名:"+this.getFrom());
    }
}
