package com.veiga.workshopmongo.services;

import com.veiga.workshopmongo.domain.Post;
import com.veiga.workshopmongo.domain.User;
import com.veiga.workshopmongo.dto.UserDTO;
import com.veiga.workshopmongo.repository.PostRepository;
import com.veiga.workshopmongo.repository.UserRepository;
import com.veiga.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() ->
                new ObjectNotFoundException(
                        "Object not found! Id: " + id + ", Type: " + Post.class.getName())
        );
    }

}
