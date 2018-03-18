package com.liust.patterns.dp.observer;

/**
 * Created by liust on 18/3/7.
 */
public class ObserverPattern {

    public static void main(String[] args){
        Father father = new Father();

        Child son = new Child("Hardon",father);
        son.goToSleep(6000);

        new Thread(father).start();
        new Thread(son).start();



//        son.setWakenUp(true);
//        son.setWakenUp(true);

    }
}

class Child implements Runnable{
    private String name;
    private Father father;
    private long sleepTime = 6 * 1000;

    Child(String name, Father father){
        this.name = name;
        this.father = father;

        father.setSon(this);
    }

    public boolean isWakenUp() {
        return wakenUp;
    }

    public void setWakenUp(boolean wakenUp) {
        this.wakenUp = wakenUp;
    }

    private boolean wakenUp=false;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", wakenUp=" + wakenUp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.getSleepTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wakeUp();
    }

    public void goToSleep(long sleepTime){
//        long sleepTime = new Random(10000).nextLong();
        this.setSleepTime(sleepTime);
        System.out.println(this + " will sleep: " + sleepTime);
    }


    private void wakeUp() {
        this.setWakenUp(true);
    }
}

class Father implements Runnable{

    private Child son;

//    Father(Child son){
//        this.son = son;
//    }

    @Override
    public void run() {
        while(!son.isWakenUp()){

            System.out.println(" isSleeping : " + getSon());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        feed(son);
    }

    private void feed(Child son) {
        System.out.println("feed child:" + son);
    }

    public Child getSon() {
        return son;
    }

    public void setSon(Child son) {
        this.son = son;
    }
}


