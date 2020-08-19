package com.groovvy.designpattern.composite;

import java.util.ArrayList;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Branch extends AbstractNode{

    private ArrayList<AbstractNode> child = new ArrayList<>();

    public Branch(String name, String post) {
        super(name, post);
    }

    public ArrayList<AbstractNode> getChild(){
        return this.child;
    }

    public void addChild(AbstractNode node){
        this.child.add(node);
    }

    public void removeChild(AbstractNode node){
        this.child.remove(node);
    }
}
