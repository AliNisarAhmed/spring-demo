package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ali = new Student(
                    "Ali", LocalDate.of(1987, Month.APRIL, 8),
                    "ali@test.com"
            );

            Student alex = new Student(
                    "Alex", LocalDate.of(2000, Month.JANUARY, 5), "alex@test.com"
            );

            studentRepository.saveAll(
                    List.of(ali, alex)
            );

        };
    }
}
