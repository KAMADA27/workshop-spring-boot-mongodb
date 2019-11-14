package com.brunokamada.workshopmongo.services;

import com.brunokamada.workshopmongo.domain.Post;
import com.brunokamada.workshopmongo.repository.PostRepository;
import com.brunokamada.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findByID(String id) {
        Optional<Post> post = repo.findById(id);

        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }
}
