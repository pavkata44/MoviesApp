package com.example.movies.movie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfig {
        @Bean
        CommandLineRunner commandLineRunner(MovieRepository repository){
        return args -> {
            List<Movie> users = new ArrayList<>();
            Movie movie = new Movie();
            movie.setTitle("FREEDOM");
            movie.setActors("James Mamonga, Vin Diesel");
            movie.setGenre(Genre.Animation);
            movie.setLength(120);
            movie.setPoster(new URL("https://pbs.twimg.com/media/Frq9b4LXsAIlr-2?format=jpg&name=large"));
            movie.setDescription("chiptuning");
            movie.setYear(2009);
            repository.save(movie);
        };

    }
}
