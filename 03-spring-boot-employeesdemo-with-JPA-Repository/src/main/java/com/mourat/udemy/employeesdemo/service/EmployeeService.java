package com.mourat.udemy.employeesdemo.service;

import com.mourat.udemy.employeesdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int employeeId);
}
