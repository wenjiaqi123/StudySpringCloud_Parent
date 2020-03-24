package com.gsm.impl;

import com.gsm.pojo.Pic;
import com.gsm.pojo.User;
import com.gsm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(MultipartFile file) {
        User user = User
                .builder()
                .name("牛大")
                .age(20)
                .money(200.1)
                .build();
        System.out.println("插入前");
        //mongoTemplate.insert(user);
        Pic pic = new Pic();
        pic.setId(12345L);
        pic.setFile(file);
        mongoTemplate.insert(pic);
        /*List<Pic> all = mongoTemplate.findAll(Pic.class);
        all.forEach(i->{
            System.out.println(i);
        });
        System.out.println("###########");
        Pic pic1 = mongoTemplate.findById(12345L, Pic.class);
        System.out.println(pic1.getId());
        MultipartFile pic1File = pic1.getFile();
        System.out.println(pic1File.getOriginalFilename());*/
        System.out.println("插入后");
    }
}
