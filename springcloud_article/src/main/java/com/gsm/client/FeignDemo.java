package com.gsm.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

//  @FeignClient("springcloud-tx") 每个模块yml中的application.name
@FeignClient("springcloud-tx")
public interface FeignDemo {

    //注意路径
    @PutMapping("/demo/update/{userId}")
    public String updateDemo(@PathVariable("userId") String id);
}
