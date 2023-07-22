package com.zaynsys.springboot.employeecrud.service;

import com.zaynsys.springboot.employeecrud.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee emp);

    void deleteById(int id);

}
