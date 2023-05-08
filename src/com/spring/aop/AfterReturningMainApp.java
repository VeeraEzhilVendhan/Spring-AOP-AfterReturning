package com.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.dao.Account;
import com.spring.aop.dao.AccountDAO;

public class AfterReturningMainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new	AnnotationConfigApplicationContext(AopConfig.class);
		
		AccountDAO accoutDAO=context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> list=accoutDAO.findAccount(true);
		
		System.out.println("main app");
		context.close();
	
	
	}
	
	
	
	

}
