package com.groovvy.designpattern.proxy.dynamic.jdk;

import com.groovvy.designpattern.proxy.staticproxy.Dog;
import com.groovvy.designpattern.proxy.staticproxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IOException {
        JdkProxy proxy = new JdkProxy();
        IPerson zhansan = (IPerson)proxy.getInstance(new Dog("zhangsan"));
        zhansan.lookForLove();
        IPerson lisi = (IPerson)proxy.getInstance(new Dog("lisi"));
        lisi.lookForLove();
        //反编译查看代理类源码$Proxxy0.class
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxxy0",new Class[]{IPerson.class});
        FileOutputStream outputStream = new FileOutputStream("D://$Proxy0.class");
        outputStream.write(bytes);
        outputStream.close();
    }
}
