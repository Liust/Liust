package com.liust.patterns.serviceFramework.print;

import com.liust.patterns.serviceFramework.Provider;
import com.liust.patterns.serviceFramework.Service;
import com.liust.patterns.serviceFramework.Services;

/**
 * Created by liust on 17/3/10.
 */
public class TestPrint {
    public static void main(String[] args){

        loadConfiguration();
        Service service = Services.newInstance("liust");
        service.log("123456");

    }


    public static void loadConfiguration(){
        Provider p = Print.newInstance();
        Services.registrationProvider("liust", p);
    }
}
