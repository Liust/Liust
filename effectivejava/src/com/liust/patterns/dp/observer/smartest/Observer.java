package com.liust.patterns.dp.observer.smartest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liust on 18/3/14.
 */
public class Observer {
    public static void main(String[] args){
        Father father = new Father();
        Mother mother = new Mother();

        Child child = new Child();
        child.addActionListener(father);
        child.addActionListener(mother);

        child.cry();
    }
}

class Child{
   List<ActionListener> actionListenerList = new ArrayList<ActionListener>();
   public void cry(){
       for(ActionListener actionListener : actionListenerList){
           actionListener.takeAction();
       }
    }

    public void addActionListener(ActionListener actionListener){
       actionListenerList.add(actionListener);
    }
}

class Father implements ActionListener{

    @Override
    public void takeAction() {
        System.out.println(" turn on TV , watch NBA ");
    }
}

class Mother implements ActionListener{

    @Override
    public void takeAction() {
        System.out.println(" open JD APP, buy something ! ");
    }
}

interface ActionListener{
    public void takeAction();
}
