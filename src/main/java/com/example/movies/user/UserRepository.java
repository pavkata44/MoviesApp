package com.example.movies.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByPassword(String password);
}
