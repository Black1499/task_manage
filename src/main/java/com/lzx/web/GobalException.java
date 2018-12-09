package com.lzx.web;

import com.lzx.vo.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@Component
@ControllerAdvice
public class GobalException {

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse catchSqlException(){
        return new ApiResponse(500,"数据请求失败,再来一次！");
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ApiResponse catchRunTimeException(){
        return new ApiResponse(500,"出错了,再试一次吧！");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ApiResponse catchException(){
        return new ApiResponse(500,"发生了不可描述的事情");
    }




}
