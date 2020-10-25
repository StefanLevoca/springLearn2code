package sk.jaroslavbeno.springlearn2code.mappers;

import org.junit.Test;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MovieMapperTest {

    @Test
    public void movieToMovieDtoIsSame(){
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);
        Set<String> set = new HashSet<>();
        set.add("Alex Kendrick");

        MovieDTO movieDTO = MovieMapper.INSTANCE.movieToMovieDto(movie);

        assertEquals(movie.getId(),movieDTO.getId());
        assertEquals(movie.getName(),movieDTO.getName());
        assertArrayEquals(movie.getDirectors().toArray(),
                movieDTO.getDirectorsOfTheMovie().toArray());

    }
}