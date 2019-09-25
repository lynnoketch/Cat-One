package com.example.demo;

import com.example.demo.Models.Student;
import org.springframework.boot.CommandLineRunner;

public class FeignRun implements CommandLineRunner {
    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

        Student reg = feignClient.registerStudent(new Student("94052", "Laurret"));
        System.out.println("Created the student: " + reg);
    }
}
