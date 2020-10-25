package sk.jaroslavbeno.springlearn2code.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.repositories.MovieRepository;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    List<Movie> all(){
        return movieRepository.findAll();
    }


}
