package com.veiga.workshopmongo.repository;

import com.veiga.workshopmongo.domain.Post;
import com.veiga.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
