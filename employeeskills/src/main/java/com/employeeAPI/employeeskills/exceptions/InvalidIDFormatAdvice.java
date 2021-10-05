package com.employeeAPI.employeeskills.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InvalidIDFormatAdvice {

    @ResponseBody
    @ExceptionHandler(InvalidIDFormatException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String InvalidIDFormatHandler(InvalidIDFormatException ex) {
        return ex.getMessage();
    }

}
