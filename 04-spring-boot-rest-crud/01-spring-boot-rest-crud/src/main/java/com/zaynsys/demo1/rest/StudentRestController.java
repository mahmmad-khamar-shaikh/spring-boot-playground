package com.zaynsys.demo1.rest;

import com.zaynsys.demo1.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> stds = new ArrayList<Student>();
        stds.add(new Student("shahid", "Shaikh"));
        stds.add(new Student("Tanzina", "Shaikh"));
        stds.add(new Student("Zain", "Shaikh"));
        return stds;

    }


}
