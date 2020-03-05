package com.gsm.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course implements Serializable {
    private Long id;
    private String courseName;
    private Integer subjectId;
    private String showOrder;
    private Integer status;
}
