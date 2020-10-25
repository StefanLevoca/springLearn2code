package sk.jaroslavbeno.springlearn2code.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    MovieService movieService;


    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        movieService.createAndAddMovie();
        movieService.createAndAddMovie();


    }
}
