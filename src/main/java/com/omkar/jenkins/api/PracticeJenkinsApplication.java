package com.omkar.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class PracticeJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(PracticeJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Hello inIt Method from Main Class");
	}

	public static void main(String[] args) { 
		logger.info("Application Executed");
		SpringApplication.run(PracticeJenkinsApplication.class, args);
		logger.info("Application Finished");
	}

}
