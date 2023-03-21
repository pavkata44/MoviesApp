package com.example.movies.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface MovieRepository  extends JpaRepository<Movie,Long> {
    Optional<Movie> findMoviesByActors(String actor);
    Optional<Movie> findMoviesByTitle(String title);
}
