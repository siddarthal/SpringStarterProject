package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;

//Aop
//Configuration
@Aspect
// combination of pointcut(joinput) and advice
//specific interception method calls
@Configuration
public class UserAcessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
//	Pointcut
//	Weaving and weaver
	@Before("execution(* com.example.demo.dao.*.*(..))")
	public void before(JoinPoint joinPoint){
//		Advice
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", joinPoint);
	}
	
}
