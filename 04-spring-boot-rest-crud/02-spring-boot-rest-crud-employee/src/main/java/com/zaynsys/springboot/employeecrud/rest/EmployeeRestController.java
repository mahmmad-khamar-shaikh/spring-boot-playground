package com.zaynsys.springboot.employeecrud.rest;

import com.zaynsys.springboot.employeecrud.dao.IEmployDAO;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    public IEmployDAO employDAO;

    public EmployeeRestController(IEmployDAO employDAO) {
        this.employDAO = employDAO;
    }


    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employDAO.findAll();
    }


}
