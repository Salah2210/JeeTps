package com.example.tp2;

import com.example.tp2.main.entities.Student;
import com.example.tp2.main.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {

    @Autowired
     private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Override
    public void run(String... args)throws Exception{
         System.out.println("*****Insertion *****");

         studentRepository.save(
                 new Student(null, "A1", "Amine", new Date(),true,null));
        studentRepository.save(
                new Student(null, "A2", "Ilyas", new Date(),true,null));
        studentRepository.save(
                new Student(null, "A3", "Saad", new Date(),false,null));
        studentRepository.save(
                new Student(null, "A4", "Arij", new Date(),true,null));
        studentRepository.save(
                new Student(null, "A5", "Lina", new Date(),false,null));
    System.out.println("***Inserted rows ****");
    System.out.println("Count: "+studentRepository.count());

        System.out.println("***Display rows**");
        List<Student> students = studentRepository.findAll();
        students.forEach(student -> {System.out.println(student.toString());});

        System.out.println("***Get Element By ID ***");
        Student student = studentRepository.findById(3).orElse(null);
        System.out.println(student.toString());

        System.out.println("*** Update an Element ****");
        student.setRegistrationNumber("S8");
        studentRepository.save(student);

        System.out.println("***Delete ana Element *****");
        studentRepository.delete(student);
        System.out.println("Count: " +studentRepository.count());

        studentRepository.deleteById(5);
        System.out.println("Count: "+studentRepository.count());

        System.out.println("***Select active students ***");
        List<Student> activeStudents = studentRepository.findByStillActive(true);
        activeStudents.forEach(s -> {
            System.out.println(s.toString());
        });

    }
}
