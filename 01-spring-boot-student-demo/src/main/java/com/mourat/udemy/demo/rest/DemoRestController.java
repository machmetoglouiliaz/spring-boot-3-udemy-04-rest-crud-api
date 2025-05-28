package com.mourat.udemy.demo.rest;

import com.mourat.udemy.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    // add code for "/hello" endpoint
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World!";
    }


}
