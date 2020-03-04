package com.gsm.controller;

import com.gsm.entity.Result;
import org.springframework.web.bind.annotation.*;

//  @CrossOrigin 允许多个微服务之间跨域访问
@CrossOrigin
//  @RestController = @ResponseBody + @Controller
@RestController
//  @RequestMapping 请求URL路径
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public Result demo(){
        int i = 1/0;
        System.out.println(1111);
        Result result = new Result();
        result.setCode(2000);
        result.setFlag(true);
        return result;
    }
}
