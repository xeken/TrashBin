package kr.hs.dgsw.hw02;

import java.util.List;

public interface UserService {

    List<User> list();
    User view(String PersonalID);
    boolean add(User user);
    User update(User user);
    Boolean delete(String PersonalID);
}
