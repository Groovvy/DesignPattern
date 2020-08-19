package com.groovvy.designpattern.prototype.shallow;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        SysUser user1 = new SysUser("groovvy",18);
        System.out.println("=======原user========");
        System.out.println(user1);
        SysUser user2 = (SysUser) user1.clone();
        user2.setAge(28);
        System.out.println("=======修改后的user========");
        System.out.println(user2);
        System.out.println("=======原user========");
        System.out.println(user1);
    }
}
