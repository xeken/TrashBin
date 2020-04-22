package kr.hs.dgsw.ex0416blog.repository;

import kr.hs.dgsw.ex0416blog.domain.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
