package kr.hs.dgsw.hw02;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    List<User> userList;

    public UserServiceImpl(){

        userList = new ArrayList<>();

        userList.add(new User("u1s2e3r4" ,"user1", "user1@gmail.com"));
        userList.add(new User("u5s6e7r8","user2", "user2@gmail.com"));
        userList.add(new User("u9s0e1r2","user3", "user3@gmail.com"));

    }
    @Override
    public List<User> list() {

        return this.userList;
    }

    @Override
    public User view(String PersonalID) {

        Iterator<User> userIterator = this.userList.iterator();
        while (userIterator.hasNext()){

            User user = userIterator.next();
            if(user.getPersonalID().equals(PersonalID))
                return user;
        }
        return null;
    }

    @Override
    public boolean add(User user) {

        return this.userList.add(user);
    }

    @Override
    public User update(User user) {

        User found = this.view(user.getPersonalID());

        if(found != null) {
            found.setName(user.getName());
            found.setEmail(user.getEmail());
        }
        return found;
    }

    @Override
    public Boolean delete(String PersonalID) {

        User found = this.view(PersonalID);

        return this.userList.remove(found);
    }
}
