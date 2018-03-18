package com.liust.patterns.serviceFramework.Item8;

import java.util.Date;

/**
 * Created by liust on 17/3/22.
 */
public class Person {
    private int id;
    private String name;
    private String address;
    private Date brithday;

    Person(){ super();}

    public Person(int id){
        this.setId(id);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;

        if(obj instanceof Person == false)
            return false;

        Person p = (Person) obj;

        if(this.getId() == p.getId())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return this.getId();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
