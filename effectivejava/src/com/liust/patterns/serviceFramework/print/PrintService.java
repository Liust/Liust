package com.liust.patterns.serviceFramework.print;

import com.liust.patterns.serviceFramework.Service;

/**
 * Created by liust on 17/3/10.
 */
public class PrintService implements Service {
    public void log(Object obj){
        System.out.println(obj);
    }
}
