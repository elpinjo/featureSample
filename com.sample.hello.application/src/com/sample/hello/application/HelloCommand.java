package com.sample.hello.application;

import org.apache.felix.service.command.CommandProcessor;
import org.osgi.service.component.annotations.*;

import com.sample.hello.api.HelloWorld;

@Component(
    property = {
        CommandProcessor.COMMAND_SCOPE + ":String=sample",
        CommandProcessor.COMMAND_FUNCTION + ":String=sayHello"
    }, service = HelloCommand.class)
public class HelloCommand {
    
    public String sayHello(String aName) {
        return helloWorld.sayHello(aName);
    }
    
    @Reference
    private volatile HelloWorld helloWorld;

}
