package com.mourat.udemy.employeesdemo.dao;

import com.mourat.udemy.employeesdemo.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    // declare header for CRUD methods

    List<Employee> findAll();

    Employee find(int id);

    void save(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);
}
