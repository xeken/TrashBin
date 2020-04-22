package kr.hs.dgsw.hw04.Service;

import kr.hs.dgsw.hw04.Domain.User;

import java.util.Optional;

public interface UserService {

    Optional<User> userView(String id, String password);
}
