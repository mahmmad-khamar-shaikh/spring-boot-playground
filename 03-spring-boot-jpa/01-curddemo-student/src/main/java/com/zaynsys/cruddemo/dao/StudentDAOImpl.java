package com.zaynsys.cruddemo.dao;

import com.zaynsys.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements IStudentDAO {

    // define field for entity manager
    private EntityManager entityManager;


    // Inject entity manger using constructor injection


    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("From Student order by lastName asc", Student.class);
        return query.getResultList();

    }

    @Override
    public List<Student> findByLastName(String lstName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student where lastName=:lstName", Student.class);
        query.setParameter("lstName", lstName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student stdObject) {
        entityManager.merge(stdObject);
    }

    @Transactional
    @Override
    public void deleteById(Integer id) {
        Student std = entityManager.find(Student.class, id);
        entityManager.remove(std);

    }

    @Override
    @Transactional
    public int deleteAll() {
        return  entityManager.createQuery("Delete from Student").executeUpdate();


    }


}
