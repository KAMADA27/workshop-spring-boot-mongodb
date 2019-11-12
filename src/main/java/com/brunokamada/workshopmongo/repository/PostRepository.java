package com.brunokamada.workshopmongo.repository;

import com.brunokamada.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
