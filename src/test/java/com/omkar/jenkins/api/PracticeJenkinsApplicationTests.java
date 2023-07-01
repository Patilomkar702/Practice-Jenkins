package com.omkar.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(PracticeJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Logger From Test Class");
		assertEquals(true, true);				//Execute Test File
	}

}
