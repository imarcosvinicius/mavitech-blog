package space.mavitech.mavitech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.mavitech.mavitech.model.Post;
import space.mavitech.mavitech.repository.BlogRepository;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

}