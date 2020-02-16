package com.github.franciscoserrano.metegolproject.controllers;

import com.github.franciscoserrano.metegolproject.services.ReadyService;
import com.github.franciscoserrano.metegolproject.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ready")
public class ReadyController {

    private final ReadyService readyService;

    @Autowired
    public ReadyController(ReadyService readyService) {
        this.readyService = readyService;
    }

    @GetMapping
    public String ready() {
        Logger.info("request received to ready endpoint");

        return this.readyService.check();
    }
}
