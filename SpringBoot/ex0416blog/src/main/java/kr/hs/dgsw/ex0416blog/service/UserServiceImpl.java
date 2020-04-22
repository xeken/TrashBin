package kr.hs.dgsw.ex0416blog.service;

import kr.hs.dgsw.ex0416blog.domain.User;
import kr.hs.dgsw.ex0416blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){

        User u = this.userRepository.save(new User("test1account", "test1password", "test1name", "test1email", "test1phone"));
    }

    @Override
    public User userSignIn(String account, String password) {

        return this.userRepository.findByAccount(account)
                .map(user -> {
                    if(user.getPassword().equals(crypto(password)))
                        return user;
                    return null;
                })
                .orElse(null);
    }

    @Override
    public User userAdd(User user) {

        Optional<User> f = this.userRepository.findByAccount(user.getAccount());
        if(f.isPresent()) return null;
        user.setPassword(user.getPassword());
        return this.userRepository.save(user);
    }

    @Override
    public User userUpdate(Long id,User user) {

        return this.userRepository.findById(id)
                .map(u -> {
                    u.setEmail(Optional.ofNullable(user.getEmail()).orElse(u.getEmail()));
                    u.setPassword(Optional.ofNullable(user.getPassword()).orElse(u.getPassword()));
                    u.setName(Optional.ofNullable(user.getName()).orElse(u.getName()));
                    u.setPhone(Optional.ofNullable(user.getPhone()).orElse(u.getPhone()));
                    u.setProfilePath(Optional.ofNullable(user.getProfilePath()).orElse(u.getProfilePath()));

                    return this.userRepository.save(u);
                })
                .orElse(null);
    }

    @Override
    public boolean userDelete(Long id) {

        try {
            this.userRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }

    @Override
    public List<User> listUser() {

        return this.userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {

        return this.userRepository.findById(id).orElse(null);
    }

    private String crypto(String password){

        String crypto = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(password.getBytes(), 0, password.getBytes().length);
            crypto = new BigInteger(1 ,messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(crypto);
        return crypto;
    }
}
