package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Training.Course;
import com.example.demo.Training.Student;

@SpringBootApplication
public class DemoApplication {

private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			Course course = Training.Course.newBuilder().build();
			Student student = Training.Student.newBuilder().build();
			
			log.info(course.toString());
			log.info(student.toString());
		};
	}
}
