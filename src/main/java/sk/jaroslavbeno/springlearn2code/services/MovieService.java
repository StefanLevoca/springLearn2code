package sk.jaroslavbeno.springlearn2code.services;

import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    Movie createAndAddMovie();

    MovieDTO getMovieById(Long id);

    List<MovieDTO> getAllMovies();

    List<MovieDTO> findMovieByName(String name);

}
