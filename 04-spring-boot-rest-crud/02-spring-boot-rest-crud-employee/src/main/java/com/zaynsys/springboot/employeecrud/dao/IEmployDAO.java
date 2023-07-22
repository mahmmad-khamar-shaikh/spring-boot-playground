package com.zaynsys.springboot.employeecrud.dao;

import com.zaynsys.springboot.employeecrud.entity.Employee;

import java.util.List;

public interface IEmployDAO {
    List<Employee> findAll();
}
