package com.gsm.client.impl;

import com.gsm.client.FeignDemo;
import org.springframework.stereotype.Component;

@Component
public class FeignDemoImpl implements FeignDemo {
    @Override
    public String updateDemo(String id) {
        System.out.println("1111111");
        return "yes";
    }
}
