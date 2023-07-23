package com.zaynsys.springboot.employeecrud.rest;

import com.zaynsys.springboot.employeecrud.dao.IEmployDAO;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import com.zaynsys.springboot.employeecrud.service.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee emp = employeeService.findById(employeeId);
        if (null == emp) {
            throw new RuntimeException("Employee with give id not found " + employeeId);

        }
        return emp;
    }

}
