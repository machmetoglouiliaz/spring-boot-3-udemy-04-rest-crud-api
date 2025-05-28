package com.mourat.udemy.employeesdemo.rest;

import com.mourat.udemy.employeesdemo.dao.EmployeeDAO;
import com.mourat.udemy.employeesdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

    @Autowired
    private EmployeeDAO dao;
    
    // Create Get mapping for "/employees"
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return dao.findAll();
    }

    // Create Get mapping for "/employees/{employeeId}"
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeWithId(@PathVariable int employeeId){
        return dao.find(employeeId);
    }

    // Create Post mapping for "/employees"
    @PostMapping("/employees")
    public void addEmployee(){

    }

    // Create Put mapping for "/employees"
    @PutMapping("/employees")
    public void updateEmployee(){

    }

    // Create Delete mapping for "/employees/{employeeId}"
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
        dao.delete(dao.find(employeeId));
    }

}
