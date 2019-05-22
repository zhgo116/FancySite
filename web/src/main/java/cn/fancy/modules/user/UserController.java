package cn.fancy.modules.user;

import cn.fancy.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public String list() {
        userService.getClass();
       return "1";

    }

}