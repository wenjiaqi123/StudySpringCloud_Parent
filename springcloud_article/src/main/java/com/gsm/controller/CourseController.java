package com.gsm.controller;

import com.gsm.entity.Result;
import com.gsm.entity.StatusCode;
import com.gsm.pojo.Course;
import com.gsm.service.CourseService;
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
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public Result selectCourse(String id){
        Course course = courseService.selectCourse(id);
        Result result = Result.builder()
                .code(StatusCode.OK)
                .flag(true)
                .data(course)
                .build();
        return result;
    }

    @GetMapping("/demo")
    public Result selectDemo(String id){
        Course course = courseService.selectDemo(id);
        Result result = Result.builder()
                .code(StatusCode.OK)
                .flag(true)
                .data(course)
                .build();
        return result;
    }
}
