package com.github.franciscoserrano.metegolproject.controllers;

import com.github.franciscoserrano.metegolproject.services.UsersService;
import com.github.franciscoserrano.metegolproject.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public String getUsers() {
        Logger.info("attempting to requests users");

        return this.usersService.getUsers();
    }
}
