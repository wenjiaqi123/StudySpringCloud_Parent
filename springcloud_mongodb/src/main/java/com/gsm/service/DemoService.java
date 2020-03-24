package com.gsm.service;

import org.springframework.web.multipart.MultipartFile;

public interface DemoService {
    void insert(MultipartFile file);
}
