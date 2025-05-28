package com.mourat.udemy.employeesdemo.rest;

import com.mourat.udemy.employeesdemo.entity.Employee;
import com.mourat.udemy.employeesdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

    @Autowired
    private EmployeeService employeeService;

    // Create Get mapping for "/employees"
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    // Create Get mapping for "/employees/{employeeId}"
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){
        return employeeService.findById(employeeId);
    }

    // Create Post mapping for "/employees"
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        // set id = 0 to save the employee
        employee.setId(0);

        // use service to save the employee
        return employeeService.save(employee);
    }

    // Create Put mapping for "/employees"
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        // use service to save the employee
        return employeeService.save(employee);
    }

    // Create Delete mapping for "/employees/{employeeId}"
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
        employeeService.deleteById(employeeId);
    }

}
