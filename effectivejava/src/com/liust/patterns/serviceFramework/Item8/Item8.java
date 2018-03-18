package com.liust.patterns.serviceFramework.Item8;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liust on 17/3/22.
 */
public class Item8 {

    public static void test(){
        System.out.println("---------");
    }

    public static void main(String [] args){
        Person person = new Person(13);

        Person person1 = new Person(13);

        Person person2 = new Person(14);

        Set<Person> people = new HashSet<>();
//        List<Person> people = new ArrayList<Person>();
        people.add(person);
        people.add(person2);
        Integer integer = new Integer(1);

        System.out.println(people.contains(person1));

    }
}
