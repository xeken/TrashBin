package kr.hs.dgsw.ex0416blog.service;

import kr.hs.dgsw.ex0416blog.domain.User;

import java.util.List;

public interface UserService {

    User userSignIn(String account, String password);
    User userAdd(User user);
    User userUpdate(Long id, User user);
    boolean userDelete(Long id);

    List<User> listUser();
    User getUser(Long id);
}
