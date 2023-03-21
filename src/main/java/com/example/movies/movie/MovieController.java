package com.example.movies.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) throws IllegalAccessException{
        movieService.addNewMovie(movie);
    }
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
      return   movieService.getAllMovies();
    }

}
