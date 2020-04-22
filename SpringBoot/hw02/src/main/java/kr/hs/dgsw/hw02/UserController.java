package kr.hs.dgsw.hw02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    // HTTP     GET(READ) POST(INSERT) PUT(UPDATE) DELETE(DELETE)
    // CRUD      CREATE      READ        UPDATE       DELDTE
    // SQL       INSERT     SELECT       UPDATE       DELETE

    @Autowired
    private UserService userService;

    @GetMapping("/user") @ResponseBody
    public List<User> List(){

        return this.userService.list();
    }

    @GetMapping("/user/{personalID}") @ResponseBody
    public User view(@PathVariable String personalID){

        return this.userService.view(personalID);
    }

    @PostMapping("/user") @ResponseBody
    public boolean add(@RequestBody User user){

        return this.userService.add(user);
    }

    @PutMapping("/user") @ResponseBody
    public User update(@RequestBody User user){

        return this.userService.update(user);
    }

    @DeleteMapping("/user/{personalID}") @ResponseBody
    public boolean delete(@PathVariable String personalID){

        return this.userService.delete(personalID);
    }
}
