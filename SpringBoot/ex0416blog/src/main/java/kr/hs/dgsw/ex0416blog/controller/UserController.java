package kr.hs.dgsw.ex0416blog.controller;

import kr.hs.dgsw.ex0416blog.domain.User;
import kr.hs.dgsw.ex0416blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/userSignIn/{account}")
    public User userSignIn(@PathVariable String account, @RequestBody String password){

        return this.userService.userSignIn(account, password);
    }

    @PostMapping("/userAdd")
    public User userAdd(@RequestBody User user){

        return this.userService.userAdd(user);
    }

    @PutMapping("/userUpdate/{id}")
    public User userUpdate(@PathVariable Long id, @RequestBody User user){

        return this.userService.userUpdate(id, user);
    }

    @DeleteMapping("/userDelete/{id}")
    public boolean userDelete(@PathVariable Long id){

        return this.userService.userDelete(id);
    }
}
