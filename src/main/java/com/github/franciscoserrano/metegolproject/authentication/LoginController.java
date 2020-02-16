package com.github.franciscoserrano.metegolproject.authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @PostMapping
    public String login(@RequestParam("user") String user) {
        if (!validUser(user))
            return "unauthorized";

        return generateToken();
    }

    private boolean validUser(String user) {
        /*
            TODO: Improve security general schema
            Compare against DB
            Add User + Roles (normal users, admin)
        */

        return user.equals("SAMPLE_USER");
    }

    private String generateToken() {
        Algorithm algorithm = Algorithm.HMAC512(this.jwtSecret);

        long nowMillis = System.currentTimeMillis();

        return JWT.create()
                .withIssuer("metegol")
                .withClaim("user", UUID.randomUUID().toString())
                .withIssuedAt(new Date(nowMillis))
                .withExpiresAt(new Date(nowMillis + 1000 * 60 * 60))
                .sign(algorithm);
    }
}
