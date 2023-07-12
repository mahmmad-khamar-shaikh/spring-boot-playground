package com.zaynsys.cruddemo.dao;

import com.zaynsys.cruddemo.entity.Student;

public interface IStudentDAO {
    public void save(Student student);
    public Student findById(Integer id);
}
