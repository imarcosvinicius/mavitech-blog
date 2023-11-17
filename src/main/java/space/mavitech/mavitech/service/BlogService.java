package space.mavitech.mavitech.service;

import space.mavitech.mavitech.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}