package sk.jaroslavbeno.springlearn2code.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;

public class EnglishHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello, world!!!");
    }
}

