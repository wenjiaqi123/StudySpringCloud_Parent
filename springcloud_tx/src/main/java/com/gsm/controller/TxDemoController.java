package com.gsm.controller;


import com.gsm.service.TxDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  @RestController = @ResponseBody + @Controller
@RestController
//  @RequestMapping 请求URL路径
@RequestMapping("/demo")
public class TxDemoController {
    @Autowired
    private TxDemoService txDemoService;

    @PutMapping("/update/{userId}")
    public String updateDemo(@PathVariable("userId") String id){
        System.out.println(id);
        txDemoService.updateDemo();
        return "12345";
    }
}
