package com.mourat.udemy.employeesdemo.dao;

import com.mourat.udemy.employeesdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")

public interface EmployeeJPARepository extends JpaRepository<Employee, Integer> {
}
