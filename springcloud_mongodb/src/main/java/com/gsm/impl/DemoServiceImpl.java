package com.gsm.impl;

import com.gsm.pojo.User;
import com.gsm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert() {
        User user = User
                .builder()
                .id(10002)
                .name("牛大")
                .age(20)
                .money(200.1)
                .build();
        System.out.println("插入前");
        mongoTemplate.insert(user);
        System.out.println("插入后");
    }
}
