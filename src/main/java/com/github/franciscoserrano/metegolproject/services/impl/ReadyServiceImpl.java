package com.github.franciscoserrano.metegolproject.services.impl;

import com.github.franciscoserrano.metegolproject.services.ReadyService;
import org.springframework.stereotype.Service;

@Service
public class ReadyServiceImpl implements ReadyService {

    @Override
    public String check() {
        return "service ready";
    }
}
