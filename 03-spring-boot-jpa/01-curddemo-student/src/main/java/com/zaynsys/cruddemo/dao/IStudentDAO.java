package com.zaynsys.cruddemo.dao;

import com.zaynsys.cruddemo.entity.Student;

import java.util.List;

public interface IStudentDAO {
    public void save(Student student);
    public Student findById(Integer id);

    public List<Student> findAll();
}
