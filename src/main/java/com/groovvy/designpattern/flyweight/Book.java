package com.groovvy.designpattern.flyweight;

import java.util.Random;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Book implements IBook {

    private String name;
    private String author;
    private String price;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.price = String.valueOf(new Random().nextInt(200));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("书名:"+name+",作者:"+author+",价格:"+price);
    }
}
