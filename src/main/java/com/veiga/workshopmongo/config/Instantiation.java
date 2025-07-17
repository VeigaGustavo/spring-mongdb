package com.veiga.workshopmongo.config;

import com.veiga.workshopmongo.domain.Post;
import com.veiga.workshopmongo.domain.User;
import com.veiga.workshopmongo.dto.AuthorDTO;
import com.veiga.workshopmongo.repository.PostRepository;
import com.veiga.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User gustavo = new User(null, "Gustavo Antunes", "gustavo@gmail.com");
        User cristovao = new User(null, "Cristovão Junior", "cristovao@gmail.com");
        User maria = new User(null, "Maria D Carmo", "maria@gmail.com");

        userRepository.saveAll(Arrays.asList(gustavo, cristovao, maria));

        Post post1 = new Post(null, sdf.parse("21/03/2018"),
                "Partiu Viagem",
                "Vou viajar para São Paulo. Abraços!",
                new AuthorDTO(gustavo));
        Post post2 = new Post(null, sdf.parse("23/03/2018"),
                "Bom dia",
                "Acordei feliz hoje!",
                new AuthorDTO(cristovao));

        postRepository.saveAll(Arrays.asList(post1, post2));

    }

}
