package space.mavitech.mavitech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.mavitech.mavitech.model.Post;

public interface BlogRepository extends JpaRepository<Post, Long> {

}