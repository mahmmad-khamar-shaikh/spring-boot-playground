package com.zaynsys.cruddemo;

import com.zaynsys.cruddemo.dao.IStudentDAO;
import com.zaynsys.cruddemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

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
        };


    }

    private void createMultipleStudent(IStudentDAO studentDAO) {

        //CReate multiple student

        System.out.println("Creating multiple object");
        Student s1= new Student("Zain","Shaikh","zain@mail.com");
        Student s2= new Student("Tanzina","Shaikh","Tanzina@mail.com");

        //Save the object
        System.out.println("saving multiple students");

        studentDAO.save(s1);

        studentDAO.save(s2);





    }

    private void createStudent(IStudentDAO studentDAO) {

        // Create the student object
        System.out.println("Creating new student object ....");
        Student tempStudent = new Student("Shahid","Shaikh","abc@mail.com");

        //save the student object

        System.out.println("Saving the student object");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Student saved, generated id " + tempStudent.getId());


    }

}
