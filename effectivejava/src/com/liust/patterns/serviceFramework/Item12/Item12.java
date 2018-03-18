package com.liust.patterns.serviceFramework.Item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by liust on 17/4/8.
 */
public class Item12 {
    public static void main(String[] args){
        Set<String> set = new TreeSet<String>();
        Collections.addAll(set,args);
        System.out.println(set);
    }
}
