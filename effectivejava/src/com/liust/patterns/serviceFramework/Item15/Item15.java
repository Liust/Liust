package com.liust.patterns.serviceFramework.Item15;

import java.io.Serializable;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by liust on 17/4/18.
 */
public class Item15 implements Serializable{


    private static final long serialVersionUID = -1742827128989268242L;

    private ThreadPoolExecutor threadPoolExecutor;

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return threadPoolExecutor;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.threadPoolExecutor = threadPoolExecutor;
    }

    public static void main(String[] args){
        boolean result = null instanceof String;
        System.out.println(result);

        Item15 item15 = new Item15(){
            @Override public ThreadPoolExecutor getThreadPoolExecutor(){
                System.out.println("--------------");
                return null;
            }
        };
        item15.getThreadPoolExecutor();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("runnable run ");
                    }
                }
        ){
            @Override
            public void run() {
                System.out.println("sub class run");
            }
        }.start();
    }
}
