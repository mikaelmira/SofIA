package com.softuai.SofIA.infrastructure.configuration.security;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Component;

@Component
public class Argon2PasswordEncoder {

    private final Argon2 argon2 = Argon2Factory.create(
            Argon2Factory.Argon2Types.ARGON2id
    );

    public String encode(String rawPassword) {
        int iterations = 3;
        int memory = 65536;
        int parallelism = 1;

        return argon2.hash(iterations, memory, parallelism, rawPassword.toCharArray());
    }

    public boolean matches(String password, String databasePassword) {
        return argon2.verify(password, databasePassword.toCharArray());
    }
}