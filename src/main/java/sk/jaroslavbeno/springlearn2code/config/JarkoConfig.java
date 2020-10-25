package sk.jaroslavbeno.springlearn2code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import sk.jaroslavbeno.springlearn2code.services.impl.PrintService;

@Configuration
@PropertySources({
        @PropertySource("classpath:jarko.properties"),
        @PropertySource("classpath:beno.properties")
})
public class JarkoConfig {

    @Value("${jarko.meno}")
    String meno;

    @Value("${jarko.priezvisko}")
    String priezvisko;

    @Value("${jarko.beno.hocico}")
    String hocico;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(meno + ", "+ priezvisko + "> "+hocico);
        return printService;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


}
