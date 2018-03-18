package com.liust.util.Log;

import com.liust.util.Log.collection.utils.HashMapHelper;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * Created by liust on 17/2/24.
 */
public class Test {
    public static void main(String[] args){
        System.out.println(" Hello World !!");
        System.out.println(Objects.equals(null,null));
        long start = new Date().getTime();

        testItem8();
        long end = new Date().getTime();
        System.out.println("time gone:" + (end - start)/1000);

    }

    public static void myMapTest(){
        Map<String,String> map = HashMapHelper.newInstance();
        map.put("1","1");
    }

    public static void testItem5(){
        long sum = 0L;
        for(long i=0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        System.out.println("sum="+sum);
    }

    public static void testItem8(){
        Date d = new Date();
        Date date = null;
        Date c = null;

        System.out.println(d == date);
        System.out.println(date == c );
        System.out.println(" null == null:" + (null == null));
    }
}
