package kr.hs.dgsw.hw04.Repository;

import kr.hs.dgsw.hw04.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findById(Long id);
}
