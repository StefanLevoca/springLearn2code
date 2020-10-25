package sk.jaroslavbeno.springlearn2code.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper( MovieMapper.class );

    @Mapping(target = "directorsOfTheMovie", source = "directors")
    MovieDTO movieToMovieDto(Movie movie);
}
