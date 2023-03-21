package com.example.movies.movie;

import com.example.movies.genre.Genre;
import jakarta.persistence.*;
import lombok.Data;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "\"movie\"", schema = "movies")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long id;

    @Column(name = "title")
    private String title;

//    @Column(name = "genre")
//    private Genre genre;
    @ManyToMany
    @JoinTable(
        name = "movie_genre",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>();
    @Column(name = "actors")
    private String actors;

    @Column(name = "movie_year")
    private Integer year;

    @Column(name =  "poster")
    private URL poster;

    @Column(name = "description")
    private String description;

    @Column(name = "length")
    private Integer length;

}
