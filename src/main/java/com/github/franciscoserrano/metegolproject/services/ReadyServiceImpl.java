package com.github.franciscoserrano.metegolproject.services;

import org.springframework.stereotype.Service;

@Service
public class ReadyServiceImpl implements ReadyService {

    @Override
    public String check() {
        return "service ready";
    }
}
