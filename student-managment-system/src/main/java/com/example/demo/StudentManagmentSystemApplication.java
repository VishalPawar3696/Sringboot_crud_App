package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	
	
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
