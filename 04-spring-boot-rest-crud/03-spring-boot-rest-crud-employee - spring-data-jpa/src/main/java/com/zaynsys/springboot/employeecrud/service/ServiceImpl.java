package com.zaynsys.springboot.employeecrud.service;

import com.zaynsys.springboot.employeecrud.dao.IEmployeeRepository;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements IEmployeeService {

    private IEmployeeRepository employeeRepository;

    @Autowired
    public ServiceImpl(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        final Optional<Employee> result = this.employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()){
            employee= result.get();
        }else{
            throw new RuntimeException("did not find employeeID "+ id);
        }
        return employee;
    }

    @Override
    public Employee save(Employee emp) {
        return this.employeeRepository.save(emp);
    }

    @Override
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }
}
