package com.gsm.controller;

import com.gsm.entity.Result;
import com.gsm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//  @CrossOrigin 允许多个微服务之间跨域访问
@CrossOrigin
//  @RestController = @ResponseBody + @Controller
@RestController
//  @RequestMapping 请求URL路径
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping("/test")
    public Result demo(MultipartFile file){
        demoService.insert(file);
        Result result = new Result();
        result.setCode(2000);
        result.setFlag(true);
        return result;
    }
}
