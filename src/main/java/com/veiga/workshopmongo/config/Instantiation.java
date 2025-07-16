package com.veiga.workshopmongo.config;

import com.veiga.workshopmongo.domain.User;
import com.veiga.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User gustavo = new User(null, "Gustavo Antunes", "gustavo@gmail.com");
        User cristovao = new User(null, "Cristovão Junior", "cristovao@gmail.com");
        User maria = new User(null, "Maria D Carmo", "maria@gmail.com");

        userRepository.saveAll(Arrays.asList(gustavo, cristovao, maria));
    }

}
