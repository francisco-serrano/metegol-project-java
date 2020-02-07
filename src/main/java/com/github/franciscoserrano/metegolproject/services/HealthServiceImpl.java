package com.github.franciscoserrano.metegolproject.services;

import org.springframework.stereotype.Service;

@Service
public class HealthServiceImpl implements HealthService {

    @Override
    public String check() {
        return "ok";
    }
}
