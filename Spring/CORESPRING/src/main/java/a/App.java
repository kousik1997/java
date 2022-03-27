package a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student s = new Student();
		System.out.println("----without spring setter method----");
		s.setId(100);
		s.setName("koushik");
		System.out.println("id is" + s.getId() + "  " + s.getName());
		System.out.println("----without spring usin constructer----");
		Student s2 = new Student(700, "koushik");
		System.out.println("id is" + s.getId() + "  " + s.getName());
		System.out.println("----dipendency injection----");

		ApplicationContext ap = new ClassPathXmlApplicationContext("kousik.xml");
		System.out.println("core container is ready " + ap);
		Student s1 = (Student) ap.getBean("x");
		System.out.println("the id is " + s1.getId() + " name is " + s1.getName());
	}
}
