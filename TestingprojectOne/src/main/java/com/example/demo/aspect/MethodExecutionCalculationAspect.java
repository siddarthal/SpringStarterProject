package com.example.demo.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Around(
			value="com.example.demo.aspect.CommonJoinPoint.timeTaken()" 
				)
		public Object  around(ProceedingJoinPoint joinPoint) throws Throwable{
//		Start time =x
//		allow execution
//		end time =y
		long startTime = System.nanoTime();

		Object result=joinPoint.proceed();

		long timeTaken = System.nanoTime() - startTime;
		logger.info("{} taken this time ... {}", joinPoint,timeTaken);
		return result;
		}
	
}
