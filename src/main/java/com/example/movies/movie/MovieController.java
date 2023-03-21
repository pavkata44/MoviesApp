package com.example.movies.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
//@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) throws IllegalAccessException{
        movieService.addNewMovie(movie);
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("greeting", "Welcome to our site!");
        return "home";
    }
//    @GetMapping
//    public ResponseEntity<List<Movie>> getAllMovies(){
//      return   movieService.getAllMovies();
//    }

    @GetMapping("/movies")
    public String getAllMovies(Model model){
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

}
