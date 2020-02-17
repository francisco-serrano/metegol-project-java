package com.github.franciscoserrano.metegolproject.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReadyServiceTest {

    @Autowired
    private ReadyService readyService;

    @Test
    public void sampleTest() {
        var result = this.readyService.check();

        assertEquals("service ready", result);
    }
}
