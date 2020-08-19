package com.groovvy.designpattern.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class BookFactory {

    public static final ConcurrentHashMap<String,IBook> pool = new ConcurrentHashMap<>(10);

    public synchronized static IBook queryBook(String name,String author){
        Book book = null;
        String key = name + "-" + author;
        if(pool.containsKey(key)){
            System.out.println("查缓存");
            book  = (Book) pool.get(key);
        }else{
            System.out.println("创建对象");
            book = new Book(name,author);
            pool.put(key,book);
        }
        return book;

    }

}
