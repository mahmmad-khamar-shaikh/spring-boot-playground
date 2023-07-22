package com.zaynsys.springboot.employeecrud.dao;

import com.zaynsys.springboot.employeecrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements IEmployDAO {
    // define field for EntityManager
    private EntityManager entityManager;

    //Set up a Constructor injection

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee emp = entityManager.find(Employee.class, id);
        return emp;
    }

    @Override
    public Employee save(Employee emp) {
        Employee dbEmployee = entityManager.merge(emp);
        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {
        Employee dbEmployee = entityManager.find(Employee.class,id);
        entityManager.remove(dbEmployee);

    }
}
