package com.gsm.controller;

import com.gsm.entity.Result;
import com.gsm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  @CrossOrigin 允许多个微服务之间跨域访问
@CrossOrigin
//  @RestController = @ResponseBody + @Controller
@RestController
//  @RequestMapping 请求URL路径
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public Result demo(){
        demoService.insert();
        Result result = new Result();
        result.setCode(2000);
        result.setFlag(true);
        return result;
    }
}
