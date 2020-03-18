package com.gsm.controller;

import com.gsm.client.FeignDemo;
import com.gsm.entity.Result;
import com.gsm.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/feign")
public class FeignDemoController {
    @Autowired
    private FeignDemo feignDemo;

    @GetMapping("/demo")
    public Result selectDemo(String id){
        System.out.println(id);
        String s = feignDemo.updateDemo(id);
        Result result = Result.builder()
                .code(StatusCode.OK)
                .flag(true)
                .message(s)
                .build();
        return result;
    }
}
