package vip.george.springbootlog.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class BaseController {

    @GetMapping("/base")
    public String base(){
        log.info("欢迎访问base,当前时间：{}",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "base..."+new Date();
    }

}
