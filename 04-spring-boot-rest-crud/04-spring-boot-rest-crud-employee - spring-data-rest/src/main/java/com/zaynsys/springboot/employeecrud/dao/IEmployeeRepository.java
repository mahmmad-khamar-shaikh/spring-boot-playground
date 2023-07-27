package com.zaynsys.springboot.employeecrud.dao;

import com.zaynsys.springboot.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
