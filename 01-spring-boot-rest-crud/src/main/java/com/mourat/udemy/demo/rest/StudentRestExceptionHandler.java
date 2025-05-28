package com.mourat.udemy.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){

        // Create a error response
        StudentErrorResponse error = new StudentErrorResponse();

        // Set response fields
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // Return error response - Jackson will convert it to JSON
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // add another exception handler to catch all exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){

        // Create a error response
        StudentErrorResponse error = new StudentErrorResponse();

        // Set response fields
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // Return error response - Jackson will convert it to JSON
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
