package com.jetora.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * 全局异常处理器
 *
 * @author jetora
 * @date: 2017-07-11 0:00
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseResult<Object> handlerException(ResourceNotFoundException e) {
        return new ResponseResult<Object>(String.valueOf(HttpStatus.NOT_FOUND), e.getMessage());
    }
}