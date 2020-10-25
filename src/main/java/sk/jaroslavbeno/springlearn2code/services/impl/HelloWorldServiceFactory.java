package sk.jaroslavbeno.springlearn2code.services.impl;

import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;

public class HelloWorldServiceFactory {

    public HelloWorldService createHelloWorldService(String language){
        switch (language){
            case "eng":
                return new EnglishHelloWorld();
            case "cze":
                return new CzechHelloWorld();
            case "svk":
                return new SlovakHelloWorld();
            default:
                return new PrimaryHelloWorld();
        }
    }

}
