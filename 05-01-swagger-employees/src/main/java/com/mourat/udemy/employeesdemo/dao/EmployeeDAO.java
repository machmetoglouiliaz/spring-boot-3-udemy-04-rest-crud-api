package com.mourat.udemy.employeesdemo.dao;

import com.mourat.udemy.employeesdemo.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    // declare header for CRUD methods

    List<Employee> findAll();

    Employee find(int id);

    Employee save(Employee employee);

    void deleteById(int employeeId);
}
