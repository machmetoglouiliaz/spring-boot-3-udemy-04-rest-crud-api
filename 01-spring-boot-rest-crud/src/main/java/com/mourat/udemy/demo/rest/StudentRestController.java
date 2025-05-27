package com.mourat.udemy.demo.rest;

import com.mourat.udemy.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        // Initialize an empty list for students
        List<Student> students = new ArrayList<>();

        // Add 3 students to the list for testing
        students.add(new Student("Mourat", "Achoi"));
        students.add(new Student("Kostas", "Vardakis"));
        students.add(new Student("Seiran", "Osman"));

        // Return list of students - JackSON will convert them to JSON stream!
        return students;
    }
}
