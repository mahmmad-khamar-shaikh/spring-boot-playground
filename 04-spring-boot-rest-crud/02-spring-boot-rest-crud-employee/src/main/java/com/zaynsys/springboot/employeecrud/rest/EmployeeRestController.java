package com.zaynsys.springboot.employeecrud.rest;

import com.zaynsys.springboot.employeecrud.dao.IEmployDAO;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import com.zaynsys.springboot.employeecrud.service.IEmployeeService;
import org.springframework.web.bind.annotation.*;

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

    // add mapping for POST/Employees - add new employee

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        // also just in case they pass an id in JSON
        employee.setId(0);
        return employeeService.save(employee);
    }
}
