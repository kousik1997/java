package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entiyy.question;

public class App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		question q = (question) ap.getBean("a1");
		q.show();

	}
}
