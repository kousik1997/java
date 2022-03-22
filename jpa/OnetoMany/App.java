package com.OnetoManyExaample;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s= new Configuration().configure().buildSessionFactory();
    	Session ses = s.openSession();
    	Transaction t= ses.beginTransaction();
    	
    	Question q= new Question();
    	q.setQname(" what is html");
    	
    	Question q1= new Question();
    	q1.setQname(" what is java");
    	
    	Answer a= new Answer();
    	a.setStudentname("mamta");
    	a.setAnswer("it is hyper text markup language");
    	
    	Answer a1= new Answer();
    	a1.setStudentname("ram");
    	a1.setAnswer("it is structure of webside");
    	
    	
    	Answer a2= new Answer();
    	a2.setStudentname("john");
    	a2.setAnswer("it is a programing lang for web application");
    	
    	Answer a3= new Answer();
    	a3.setStudentname("john");
    	a3.setAnswer("it is a purely oops language");
    	
    	
    	Answer a4= new Answer();
    	a4.setStudentname("mamta");
    	a4.setAnswer("it is used for web,console & mobile application");
    	ArrayList<Answer> arr1= new ArrayList<Answer>();
    	arr1.add(a);
    	arr1.add(a1);
    	arr1.add(a2);
    	
    	ArrayList<Answer> arr2= new ArrayList<Answer>();
    	//arr2.add(a);
    	arr2.add(a4);
    	
    	q.setAnswers(arr1);
    	q1.setAnswers(arr2);
    	
    	ses.save(q);
    	ses.save(q1);
    	t.commit();
    	ses.close();
    	System.out.println("add successfully");
    }
}
    	
    	
    	
    	
   

