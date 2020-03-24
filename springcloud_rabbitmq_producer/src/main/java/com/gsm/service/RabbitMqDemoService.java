package com.gsm.service;

import com.gsm.entity.User;

public interface RabbitMqDemoService {
    void insertRabbitmqDemo(String name);

    void insertRabbitmqDemoFanout(User user);
}
