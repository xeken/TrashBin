package kr.hs.dgsw.ex0326.Repository;

import kr.hs.dgsw.ex0326.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
