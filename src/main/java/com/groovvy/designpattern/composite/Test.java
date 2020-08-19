package com.groovvy.designpattern.composite;

import java.util.ArrayList;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public class Test {
    public static void main(String[] args) {
        Branch root = new Branch("groovvy","总经理");

        Branch manager = new Branch("zhangsan","经理");

        Leaf secretary = new Leaf("zyx","秘书");




        Leaf t1 = new Leaf("t1","财务");
        Leaf t2 = new Leaf("t2","财务");

        Leaf hr1 = new Leaf("hr1","人事");
        Leaf hr2 = new Leaf("hr2","人事");

        manager.addChild(t1);
        manager.addChild(t2);
        manager.addChild(hr1);
        manager.addChild(hr2);

        root.addChild(secretary);
        root.addChild(manager);

        getTreeInfo(root,1);


    }

    public static void getTreeInfo(Branch root,int index){
        System.out.print("+");
        root.getInfo();
        ArrayList<AbstractNode> child = root.getChild();
        for(int i=0 ; i< root.getChild().size(); i++){
            for (int j = 0; j < index; j++) {
                System.out.print(" ");
            }
            if(child.get(i) instanceof Leaf){
                System.out.print("-");
                child.get(i).getInfo();
            }else {
                getTreeInfo((Branch) child.get(i),i);
            }

        }
    }

}
