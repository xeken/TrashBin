package kr.hs.dgsw.ex0326.Controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import kr.hs.dgsw.ex0326.Domain.User;
import kr.hs.dgsw.ex0326.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    public List<User> listAll(){

        return this.userService.ListAllUser();
    }

    @GetMapping("/userview/{id}")
    public Optional<User> viewUser(@PathVariable long id){

        return this.userService.View(id);
    }

    @PostMapping("/userinsert")
    public User addUser(@RequestBody User user){

        return this.userService.addUser(user);
    }

    //리퀘스트바디 -> 객체 (json파싱)
    //리퀘스트파람 -> 기본자료형 ex:(/userupdate?=20) 이런식으로 쓸 떄도 사용
    @PutMapping("/userupdate/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user){

        return this.userService.updateUser(id, user);
    }

    @DeleteMapping("/userdelete/{id}")
    public Boolean deleteUser(@PathVariable long id){

        return this.userService.deleteUser(id);
    }
}
