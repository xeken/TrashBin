package kr.hs.dgsw.hw04.Controller;

import kr.hs.dgsw.hw04.Domain.User;
import kr.hs.dgsw.hw04.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userView/{id},{password}")
    public Optional<User> userView (@PathVariable String id, @PathVariable String password){

        return this.userService.userView(id, password);
    }

}
