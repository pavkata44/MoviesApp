package com.example.movies.user;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "\"Users\"", schema = "movies")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    String username;

    @Column(name = "user_pass")
    private String password;

    @Column(name = "user_role")
    private Role role;


}
