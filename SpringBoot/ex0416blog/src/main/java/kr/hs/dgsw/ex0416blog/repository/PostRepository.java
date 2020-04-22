package kr.hs.dgsw.ex0416blog.repository;

import kr.hs.dgsw.ex0416blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserId(long userId);
    Optional<Post> findTopByUserIdOrderByIdDesc(Long userId);
}
