package com.cy.pj.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cy.pj.common.vo.JsonResult;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public JsonResult doHandleRuntimeException(RuntimeException e){
    	e.printStackTrace();//也可以写日志
		return new JsonResult(e);//封装异常信息
	}
}