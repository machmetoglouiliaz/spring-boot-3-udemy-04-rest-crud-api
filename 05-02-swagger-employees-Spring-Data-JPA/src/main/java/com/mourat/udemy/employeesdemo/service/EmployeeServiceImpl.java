package com.mourat.udemy.employeesdemo.service;

import com.mourat.udemy.employeesdemo.dao.EmployeeJPARepository;
import com.mourat.udemy.employeesdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    // declare and inject employee repository
    private EmployeeJPARepository repo;

    @Autowired
    public EmployeeServiceImpl(EmployeeJPARepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = repo.findById(id);

        Employee emp = null;
        if(result.isPresent()) emp = result.get();
        else throw new RuntimeException("Employee id not found! - " + id);

        return emp;
    }

    @Override
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public void deleteById(int employeeId) {
        repo.deleteById(employeeId);
    }
}
