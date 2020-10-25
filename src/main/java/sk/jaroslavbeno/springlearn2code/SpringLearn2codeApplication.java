package sk.jaroslavbeno.springlearn2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import sk.biblia.BibleVerses;
import sk.jaroslavbeno.springlearn2code.services.HelloWorldService;
import sk.jaroslavbeno.springlearn2code.services.RestApiService;
import sk.jaroslavbeno.springlearn2code.services.impl.PrintService;

@SpringBootApplication
@ImportResource("classpath:bean-configurator.xml")
public class SpringLearn2codeApplication {

	public static void main(String[] args) {
		ApplicationContext kontext = SpringApplication.run(SpringLearn2codeApplication.class, args);
		System.out.println(kontext.getBean(RestApiService.class).getTodo(1L));
	}

}
