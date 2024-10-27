package com.ak.javatechie.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	private static final Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void myInit() {
		logger.info("Application Started...");
		
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
