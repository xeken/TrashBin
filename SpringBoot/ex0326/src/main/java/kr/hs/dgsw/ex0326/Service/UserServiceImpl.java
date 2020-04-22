package kr.hs.dgsw.ex0326.Service;

import kr.hs.dgsw.ex0326.Domain.User;
import kr.hs.dgsw.ex0326.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> ListAllUser() {

        List<User> userList = this.userRepository.findAll();

        return userList;
    }

    @Override
    public Optional<User> View(long id) {

        return this.userRepository.findById(id);
    }

    @Override
    public User addUser(User user) {

//        this.userRepository.findByEMail(user.getEMail())
//                .map(null)
//                .orElse(this.userRepository.save(user));

        Optional<User> found = this.userRepository.findByEMail(user.getEMail());
        if(found.isPresent()) return null;

        return this.userRepository.save(user);
    }


    @Override
    public User updateUser(long id, User user) {

        return this.userRepository.findById(id).map(f ->{
            f.setEMail(Optional.ofNullable(user.getEMail()).orElse(f.getEMail()));
            //user.setUserName(f.getUserName());
            f.setUserName(Optional.ofNullable(user.getUserName()).orElse(f.getUserName()));
            return this.userRepository.save(f);
        }).orElse(null);

    }

    @Override
    public boolean deleteUser(long id) {

        this.userRepository.deleteById(id);

        if(!View(id).isPresent())
            return true;

        return false;
    }
}
