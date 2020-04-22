package kr.hs.dgsw.hw04.Repository;

import kr.hs.dgsw.hw04.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
