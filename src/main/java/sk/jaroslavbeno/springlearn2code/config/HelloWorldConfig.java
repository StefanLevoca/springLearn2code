package sk.jaroslavbeno.springlearn2code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;
import sk.jaroslavbeno.springlearn2code.services.impl.HelloWorldServiceFactory;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldServiceFactory createFactory(){
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("cze")
    public HelloWorldService czechHelloWorld(HelloWorldServiceFactory helloWorldServiceFactory){
        return helloWorldServiceFactory.createHelloWorldService("cze");
    }

    @Bean
    @Profile("eng")
    public HelloWorldService engHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("eng");
    }

    @Bean
    @Profile({"svk","default"})
    public HelloWorldService svkHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("svk");
    }

    @Bean
    @Primary
    @Profile("eng")
    public HelloWorldService primaryHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("primary");
    }


}
