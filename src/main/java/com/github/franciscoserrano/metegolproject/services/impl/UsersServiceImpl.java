package com.github.franciscoserrano.metegolproject.services.impl;

import com.github.franciscoserrano.metegolproject.repositories.UserRepository;
import com.github.franciscoserrano.metegolproject.services.UsersService;
import com.github.franciscoserrano.metegolproject.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    private final UserRepository userRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getUsers() {
        Logger.info("attempting to requests users");

        return this.userRepository.findAll().toString();
    }
}
