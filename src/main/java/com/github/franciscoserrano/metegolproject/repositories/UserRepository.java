package com.github.franciscoserrano.metegolproject.repositories;

import com.github.franciscoserrano.metegolproject.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
}
