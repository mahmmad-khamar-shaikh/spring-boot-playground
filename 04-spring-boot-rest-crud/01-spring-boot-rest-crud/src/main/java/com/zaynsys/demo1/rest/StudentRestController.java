package com.zaynsys.demo1.rest;

import com.zaynsys.demo1.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> studentList;

    // define @PostConstruct to load the student data... Only once
    @PostConstruct
    public void loadData() {
        studentList = new ArrayList<>();
        studentList.add(new Student("shahid", "Shaikh"));
        studentList.add(new Student("Tanzina", "Shaikh"));
        studentList.add(new Student("Zain", "Shaikh"));
    }

    //

    @GetMapping("/student")
    public List<Student> getStudents() {

        return studentList;

    }


}
