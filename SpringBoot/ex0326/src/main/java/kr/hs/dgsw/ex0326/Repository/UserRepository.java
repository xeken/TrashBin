package kr.hs.dgsw.ex0326.Repository;

import kr.hs.dgsw.ex0326.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEMail(String eMail);
}
