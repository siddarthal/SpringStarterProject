package com.project.learning;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.learning.sorting.BinarySearchImple;

@SpringBootApplication
public class LearningApplication {
	static Logger logger = LoggerFactory.getLogger(LearningApplication.class);
	public static void main(String[] args) {
	
		ConfigurableApplicationContext config= SpringApplication.run(LearningApplication.class, args);
		 BinarySearchImple bsearch= config.getBean(BinarySearchImple.class);
		 bsearch.binarysearch(new int[] {1,2,3,4}, 0);
		
//		BinarySearchImple obj =new BinarySearchImple(new BubbleSort());
//		int arr[]= {1,3,4,5};
//		String a=obj.binarysearch(arr, 0);
		
//		logger.info(a);
	}

}
