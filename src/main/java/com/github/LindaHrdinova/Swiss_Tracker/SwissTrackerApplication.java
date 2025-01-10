package com.github.LindaHrdinova.Swiss_Tracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SwissTrackerApplication {

	private static final Logger logger = LoggerFactory.getLogger(SwissTrackerApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SwissTrackerApplication.class, args);
		logger.info("Aplikace běží na adrese: http://localhost:{}", applicationContext.getEnvironment().getProperty("local.server.port"));
	}
}
