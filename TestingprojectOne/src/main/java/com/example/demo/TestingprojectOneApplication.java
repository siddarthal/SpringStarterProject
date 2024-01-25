package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.Service1;
import com.example.demo.service.Service2;

@SpringBootApplication
public class TestingprojectOneApplication implements CommandLineRunner {
	private Logger  logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	Service1 svc1;
	@Autowired
	Service2 svc2;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestingprojectOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("{} hi from svc1",svc1.callFromDb());
		logger.info(svc2.callFromDb());
	}

}
