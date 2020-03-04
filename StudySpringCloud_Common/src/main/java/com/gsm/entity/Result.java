package com.gsm.entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * 返回实体
 */
public class Result {
    //是否成功
    private Boolean flag;
    //返回码
    private Integer code;
    //返回信息
    private String message;
    //返回数据
    private Object data;
}
