package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Resource res = new ClassPathResource("applicationContext.xml");
		// BeanFactory bf = new XmlBeanFactory(res);

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s = (Student) ac.getBean("ai");
		s.display();

	}
}
