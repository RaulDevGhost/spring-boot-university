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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student raul = new Student(
                    "Raul",
                    "raul@gmail.com",
                    LocalDate.of(1983, Month.SEPTEMBER, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1983, Month.SEPTEMBER, 5)
            );

            repository.saveAll(
                    List.of(raul, alex)
            );
        };
    }
}
