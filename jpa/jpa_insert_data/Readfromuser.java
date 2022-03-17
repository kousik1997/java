package com.jpaa.jpaaa;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Readfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id");
		n = sc.nextInt();
		SessionFactory s = new Configuration().configure().buildSessionFactory();
        Session ses = s.openSession();
        Employee e = ses.get(Employee.class, n);
        ses.close();
        s.close();
        
        System.out.println("ID :" +e.getId() + " " +"Name is :"+ e.getFirstName() + " " +"Surname is : "+ e.getLasttName() + " "+"Phone :"+e.getPhone());
	}

}
