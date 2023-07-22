package com.zaynsys.springboot.employeecrud.rest;

import com.zaynsys.springboot.employeecrud.dao.IEmployDAO;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import com.zaynsys.springboot.employeecrud.service.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IEmployeeService employeeService;

    public EmployeeRestController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


}
