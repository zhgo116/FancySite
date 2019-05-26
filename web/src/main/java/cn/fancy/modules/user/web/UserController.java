package cn.fancy.modules.user.web;

import cn.fancy.common.ResultVo;
import cn.fancy.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public ResultVo list() {
        userService.getClass();
       return ResultVo.success("12");

    }

}