package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyfirstprojectAspect {
	
	
	@Pointcut("execution(* com.controller.StudentController.showForm(..))")
	private void showForm() {
		System.out.println("PointCut Student.showForm()");
	}
	
	@Pointcut("execution(* com.controller.StudentController.saveStudent(..))")
	private void saveStudent() {
		System.out.println("PointCut Student.saveStudent()");
	}
	
	@Pointcut("showForm() || saveStudent()") 
	private void showSave() {} 
	
	
	@Before("showSave()")
	public void beforeShowSave(JoinPoint joinPoint ) {
		
		System.out.println("\nBEFORE");
		System.out.println(joinPoint.getSignature().toShortString()); 
		System.out.println("Vypisy v Pointcut-och vobec nefunguju !!! ");
		
		Object [] objects = joinPoint.getArgs(); 
		for (Object object : objects) {
			System.out.println(object);
		}
		
	} 
	
	@AfterReturning(pointcut="showSave()", returning="result")
	public void afterShowSave(JoinPoint joinPoint, Object result) { 
		
		System.out.println("\nAFTERRETURNING");
		System.out.println(joinPoint.getSignature().toShortString());
		System.out.println("Result: " + result.toString());
		System.out.println("\n");
	}
	
	@AfterThrowing("execution(* com.controller.StudentController.*(..))")
	public void afterThrowingStudentController() {
		System.out.println("\nAFTERTHROWING");
	}
	
	
//	@Before("execution(* com.controller.StudentController.showForm(..))")
//	public void beforeShowForm() {
//		System.out.println("Before Student.showForm()");
//	}
//	
//	@After("execution(* com.controller.StudentController.showForm(..))")
//	public void afterShowForm() {
//		System.out.println("After Student.showForm()");
//	}
	
	
//	@Before("execution(* com.controller.StudentController.*(..))")
//	public void beforeStudent() {
//		
//		System.out.println("Hello I am Student");
//		
//	}
//	@AfterReturning(" execution (* com.controller.StudentController.*(..))")
//	public void afterReturning() { 
//		System.out.println("Hello I am AFTER RETURNING");
//	}
}
