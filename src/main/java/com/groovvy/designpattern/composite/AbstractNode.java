package com.groovvy.designpattern.composite;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public abstract class AbstractNode {

    private String name;
    private String post;

    public AbstractNode(String name,String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void getInfo(){

        System.out.println("岗位:"+ post + ",名字:" + name);
    }

}
