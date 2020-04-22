package kr.hs.dgsw.ex0326.Service;

import kr.hs.dgsw.ex0326.Domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> ListAllUser();
    Optional<User> View(long id);
    User addUser(User user);
    User updateUser(long id, User user);
    boolean deleteUser(long id);
}
