package com.liust.patterns.serviceFramework.Item6;

import java.util.Arrays;

/**
 * Created by liust on 17/3/21.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object obj){
       ensureCapacity();
       elements[size++] = obj;
    }

    public Object pop(){

        if(size == 0){
            throw new RuntimeException(" Stack is empty !");
        }

        Object result = elements[--size];
        elements[size] = null;

        // may be memory leak: obsolete reference
        return result;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }


}
