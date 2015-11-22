package com.imooc.mvcdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;


@ControllerAdvice("/test")
public class ControllerAdviceTest {
	private static Logger log = LoggerFactory.getLogger(ControllerAdviceTest.class);
	
	@RequestMapping("/tt")
	  @ExceptionHandler(Exception.class)  
	    @ResponseStatus(value=HttpStatus.BAD_REQUEST)  
	    public String processUnauthenticatedException(NativeWebRequest request,Exception e) {  
	        log.error(e.getMessage());  
	        System.out.println(e.getMessage());
	        return "success"; //返回一个逻辑视图名  
	    } 
	
}
