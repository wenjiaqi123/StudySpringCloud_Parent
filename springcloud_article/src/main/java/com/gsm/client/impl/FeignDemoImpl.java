package com.gsm.client.impl;

import com.gsm.client.FeignDemo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FeignDemoImpl implements FeignDemo {
    @Override
    public String updateDemo(String id) {
        System.out.println(new Date());
        System.out.println("1111111");
        return "我是熔断器";
    }
}
