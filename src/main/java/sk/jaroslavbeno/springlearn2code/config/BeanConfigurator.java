package sk.jaroslavbeno.springlearn2code.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import sk.biblia.BibleVerses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeanConfigurator {

//    @Bean
    public BibleVerses getBibleVerses(){
        return new BibleVerses();
    }

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConverters.add(converter);

        RestTemplate restTemplate = builder.build();
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
}
