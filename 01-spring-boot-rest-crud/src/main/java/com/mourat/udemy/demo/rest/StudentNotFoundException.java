package com.mourat.udemy.demo.rest;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }
}
