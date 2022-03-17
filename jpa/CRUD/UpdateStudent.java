package com.CRUDHBEFg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class UpdateStudent {
	public static void main(String[] args) {
		// create session factory object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//getting session object from session factory
		Session session = sessionFactory.openSession();
		
		//getting transaction object from session object
		session.beginTransaction();
		
		Student student = session.get(Student.class, 2);
		student.setStudentName("Priya");
		System.out.println("record updated");
		session.getTransaction().commit();
		sessionFactory.close();
	}

}
