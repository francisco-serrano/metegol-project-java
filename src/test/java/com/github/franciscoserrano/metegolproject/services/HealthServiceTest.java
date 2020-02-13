package com.github.franciscoserrano.metegolproject.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HealthServiceTest {

    @Autowired
    private HealthService healthService;

    @Test
    public void sampleTest() {
        var result = this.healthService.check();

        assertEquals("ok", result);
    }
}
