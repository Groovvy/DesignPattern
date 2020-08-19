package com.groovvy.designpattern.flyweight;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) {

        IBook book = BookFactory.queryBook("红楼梦","曹雪芹");
        book.showInfo();

        IBook book2 = BookFactory.queryBook("红楼梦","曹雪芹");
        book2.showInfo();
    }
}
