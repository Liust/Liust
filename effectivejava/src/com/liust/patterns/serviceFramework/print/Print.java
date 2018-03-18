package com.liust.patterns.serviceFramework.print;

import com.liust.patterns.serviceFramework.Provider;
import com.liust.patterns.serviceFramework.Service;

/**
 * Created by liust on 17/3/10.
 */
public class Print implements Provider {

    private static final Print print = new Print();
    private Print(){}

    @Override
    public Service newService() {
        return new PrintService();
    }

    public static Print newInstance(){
        return print;
    }
}
