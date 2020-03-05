package com.gsm.exception;

import com.gsm.entity.Result;
import com.gsm.entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  @RestControllerAdvice 对Controller增强
@RestControllerAdvice
public class GlobalExceptionHandler {

    //  @ExceptionHandler(value = Exception.class)  全局异常处理器
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e){
        Result result = Result.builder()
                .flag(false)
                .code(StatusCode.ERROR)
                .message(e.getMessage())
                .build();
        return result;
    }
}
