package com.groovvy.designpattern.prototype.deep;

import java.util.ArrayList;

/**
 * @author wanghuaan
 * @date 2020/8/18
 **/
public class Classroom implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public Classroom clone(){
        Classroom classroom=null;
        try {
            classroom = (Classroom)super.clone();
            classroom.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return classroom;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
