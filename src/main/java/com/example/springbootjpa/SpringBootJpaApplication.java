package com.example.springbootjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			var student = new Student();
			student.setFirstName("Mitsuri");
			student.setLastName("Kanroji");
			student.setEmail("kanroji.mitsuri@test.com");
			student.setAge(19);
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			studentRepository.save(student);
		};
	}

}
