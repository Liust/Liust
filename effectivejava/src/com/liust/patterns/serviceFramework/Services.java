package com.liust.patterns.serviceFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liust on 17/3/9.
 */

//Noninstantiable class for service registration and access
public class Services {
    private Services(){}//

    //
    private static final Map<String,Provider> providers =
            new ConcurrentHashMap<String,Provider>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";
    //Provider registration api
    public static void registrationDefaultProvider(Provider p ){
        registrationProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registrationProvider(String name, Provider p){
        providers.put(name, p);
    }

    //service access api
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider p = providers.get(name);

        if(null == p)
            throw new RuntimeException("No provider registered with name: " + name);
        return p.newService();
    }

}
