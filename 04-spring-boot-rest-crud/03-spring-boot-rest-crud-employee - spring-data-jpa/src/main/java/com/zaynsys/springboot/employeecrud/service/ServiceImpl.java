package com.zaynsys.springboot.employeecrud.service;

import com.zaynsys.springboot.employeecrud.dao.IEmployDAO;
import com.zaynsys.springboot.employeecrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceImpl implements IEmployeeService {

    private IEmployDAO employDAO;

    @Autowired
    public ServiceImpl(IEmployDAO employDAO) {
        this.employDAO = employDAO;
    }

    @Override
    public List<Employee> findAll() {
        return this.employDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return this.employDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee emp) {
        return this.employDAO.save(emp);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        this.employDAO.deleteById(id);
    }
}
