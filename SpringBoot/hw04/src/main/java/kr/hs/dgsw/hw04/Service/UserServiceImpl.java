package kr.hs.dgsw.hw04.Service;

import kr.hs.dgsw.hw04.Domain.User;
import kr.hs.dgsw.hw04.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired //d의존성 주입
    private UserRepository userRepository;

    @PostConstruct
    private void Init(){ //초기 데이터용

        User testUser = this.userRepository.save(new User("tid", "testName", "password", "testEmail@test.test"));
        LocalDateTime fakeDateTime = LocalDateTime.of(2018, 4, 11, 17, 44, 48, 33);
        testUser.setJoined(fakeDateTime);

    }


    @Override
    public Optional<User> userView(String id, String password) {

        try {
            Optional<User> user = this.userRepository.findById(id);
            if(user.isPresent())
                if (password.equals(user.get().getPassword()))
                    return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

