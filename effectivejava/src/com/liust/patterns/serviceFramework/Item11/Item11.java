package com.liust.patterns.serviceFramework.Item11;

/**
 * Created by liust on 17/3/31.
 */
public class Item11 {
    public static void main(String[] args){
        Ball a = new Ball();
        a.setSize(1);
        a.setType(2);
        a.setWeight(3);

        System.out.println("ball a : " + a);

        Ball b = a.clone();
        System.out.println("ball b :" + b);

        System.out.println("a==b:"+(a==b));
        System.out.println("a.getClass==b.getClass:"+(a.getClass()==b.getClass()));
        System.out.println("a.equals(b):"+(a.equals(b)));
    }
}
