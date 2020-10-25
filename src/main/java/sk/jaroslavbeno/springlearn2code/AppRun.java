package sk.jaroslavbeno.springlearn2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;

@Component
public class AppRun {


    @Autowired
    HelloWorldService helloWorldService;


//    public AppRun(@Qualifier("slovakHelloWorld") HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    public void run(){
        helloWorldService.sayHello();
    }

//    @Qualifier("slovakHelloWorld")
//    public void setHelloWorldService(@Qualifier("slovakHelloWorld") HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }
}
