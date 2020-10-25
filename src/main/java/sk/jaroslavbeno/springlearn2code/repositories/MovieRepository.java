package sk.jaroslavbeno.springlearn2code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
