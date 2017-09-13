package com.sample.hello.provider;

import org.osgi.service.component.annotations.Component;

import com.sample.hello.api.HelloWorld;

@Component
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String aName) {
        
        return "Hello " + aName + " to the Karaf world";
    }

}
