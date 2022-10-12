package vip.george.springbootlog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class UserController {

    @GetMapping("/login")
    public String login(@RequestParam String name){
        Logger logger = Logger.getLogger(UserController.class.getName());
        logger.info("java日志jul输出日志信息:用户登录请求");
        return "hello "+name+"  登录成功";
    }
}
