package com.groovvy.designpattern.flyweight;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class StringTest {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "he" + new String("llo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "he";
        String s8 = "llo";
        String s9 = s7 + s8;


        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //true
        System.out.println(s1 == s4); //false
        System.out.println(s1 == s5); //false
        System.out.println(s1 == s6); //true
        System.out.println(s1 == s9); //fasle

    }
}
