package com.gsm.impl;

import com.gsm.dao.CourseDao;
import com.gsm.pojo.Course;
import com.gsm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Course selectCourse(String id) {
        //先从缓存中取
        Course course = (Course) redisTemplate.opsForValue().get("article_" + id);
        //如果没有
        if (course == null) {
            //从数据库取
            course = courseDao.selectCourse(id);
            //插入到缓存中
            redisTemplate.opsForValue().set("article_" + id,course);
        }
        return course;
    }
}
