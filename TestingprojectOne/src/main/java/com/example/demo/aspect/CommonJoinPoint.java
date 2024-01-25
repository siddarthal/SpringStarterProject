package com.example.demo.aspect;


import org.aspectj.lang.annotation.Pointcut;



public class CommonJoinPoint {
	@Pointcut("execution(* com.example.demo.dao.*.*(..))")
	public void dataLayerExecution() {
		
	}
	@Pointcut("execution(* com.example.demo.service.*.*(..))")
    public void businessLayerExecution() {
		
	}
	@Pointcut("com.example.demo.aspect.CommonJoinPoint.businessLayerExecution() && com.example.demo.aspect.CommonJoinPoint.dataLayerExecution()")
	public void allLayerExecution() {
		
	}
	@Pointcut("bean(*dao*)")
	public void beanWithDao() {
		
	}
	@Pointcut("within(com.example.demo.dao..*)")
	public void withinDaoPackage() {
		
	}
	@Pointcut("@annotation(com.example.demo.aspect.TrackTime)")
	public void timeTaken() {
		
	}
}

