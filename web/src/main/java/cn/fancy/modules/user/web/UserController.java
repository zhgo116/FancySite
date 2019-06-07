package cn.fancy.modules.user.web;

import cn.fancy.common.ResultVo;
import cn.fancy.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    @ResponseBody
    public ResultVo list() {
        String a=userService.getList();
       return ResultVo.success(a);

    }

    @GetMapping("test")
    public String test() {
        userService.getClass();
        return "test";

    }

}