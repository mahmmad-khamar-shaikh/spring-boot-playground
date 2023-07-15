package com.zaynsys.cruddemo;

import com.zaynsys.cruddemo.dao.IStudentDAO;
import com.zaynsys.cruddemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandlineRunner(IStudentDAO studentDAO) {

        return runner -> {
            // createStudent(studentDAO);
 createMultipleStudent(studentDAO);
            // readStudents(studentDAO);
            // queryForStudents(studentDAO);
            // queryStudentsByLastName(studentDAO);
            // updateStudent(studentDAO);
           // deleteStudent(studentDAO);
           // deleteAllStudent(studentDAO);


        };
    }

    private void deleteAllStudent(IStudentDAO studentDAO) {
        studentDAO.deleteAll();
    }
    private void deleteStudent(IStudentDAO studentDAO) {
        int studentId = 4;
        studentDAO.deleteById(studentId);
    }

    private void updateStudent(IStudentDAO studentDAO) {
        int studentId = 1;
        Student std = studentDAO.findById(studentId);
        std.setFistName("Mahmmadkhamar");
        studentDAO.update(std);


    }

    private void queryStudentsByLastName(IStudentDAO studentDAO) {
        List<Student> stds = studentDAO.findByLastName("Shaikh");
        for (Student std : stds) {
            System.out.println(std);
        }
    }

    private void queryForStudents(IStudentDAO studentDAO) {
        // Get a list of students

        List<Student> stds = studentDAO.findAll();

        // display list of students
        for (Student std : stds) {
            System.out.println(std);
        }


    }

    private void readStudents(IStudentDAO studentDAO) {
// Create a student Object
        System.out.println("Creating new student object");
        Student tempStudent = new Student("Tony", "Stark", "Tony@mail.com");
// Save the student
        studentDAO.save(tempStudent);
// display id of the saved student
        int id = tempStudent.getId();
        System.out.println("Saved student. GenerateId " + id);

// retrieve student based on the id
        Student readStudent = studentDAO.findById(id);
        System.out.println("student  --- > " + readStudent);


// display student
    }

    private void createMultipleStudent(IStudentDAO studentDAO) {

        //CReate multiple student

        System.out.println("Creating multiple object");
        Student s1 = new Student("Zain", "Shaikh", "zain@mail.com");
        Student s2 = new Student("Tanzina", "Shaikh", "Tanzina@mail.com");

        //Save the object
        System.out.println("saving multiple students");

        studentDAO.save(s1);

        studentDAO.save(s2);


    }

    private void createStudent(IStudentDAO studentDAO) {

        // Create the student object
        System.out.println("Creating new student object ....");
        Student tempStudent = new Student("Shahid", "Shaikh", "abc@mail.com");

        //save the student object

        System.out.println("Saving the student object");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Student saved, generated id " + tempStudent.getId());


    }

}
