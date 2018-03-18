package com.liust.patterns.serviceFramework.Item11;

import java.util.Map;
import java.util.Hashtable;

/**
 * Created by liust on 17/3/31.
 */
public class Ball implements Cloneable {
    private int type;
    private int weight;
    private int size;
    private int[] aa = new int[10];
    Map a = new Hashtable();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Ball@size="+size+"|type="+type+",weight="+weight;
    }

    @Override
    public Ball clone(){
        try{
            return (Ball)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
