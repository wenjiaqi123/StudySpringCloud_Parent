package com.gsm.pojo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Pic {
    private Long id;
    private MultipartFile file;
}
