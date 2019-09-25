package com.example.demo;

import com.example.demo.Models.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;

public class DummyData implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(studentRepository.findAll().isEmpty())
        {
            studentRepository.save(new Student("94052", "Laurret"));
        }

    }
}
