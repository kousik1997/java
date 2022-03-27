package com;
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
    	
    	Answer an1=new Answer(); 
    	an1.setId(1);
        an1.setAnswer("Java is a platform");  
        an1.setStudentname("Koushik");  
        
        Answer an2=new Answer(); 
    	an2.setId(2);
        an2.setAnswer("Java is a programming language");  
        an2.setStudentname("Aniruddha");  
        
        Question q1=new Question();  
        q1.setQname("What is Java?");  
        ArrayList<Answer> l1=new ArrayList<Answer>();  
        l1.add(an1);  
        l1.add(an2);  
        q1.setAnswers(l1);  
        
        Answer an3=new Answer(); 
    	an3.setId(3);
        an3.setAnswer("it is structure of webside");  
        an3.setStudentname("Subhadip");  
        
        Answer an4=new Answer(); 
    	an4.setId(4);
        an4.setAnswer("it is hyper text markup language");  
        an4.setStudentname("Ashoke");  
        
        Question q2=new Question();  
        q2.setQname("What is HTML?");  
        ArrayList<Answer> l2=new ArrayList<Answer>();  
        l2.add(an3);  
        l2.add(an4);  
        q2.setAnswers(l2);  
        
        //q1.setAnswers(l1);
    	//q2.setAnswers(l2);
        
        
    	
    	ses.save(q1);
    	ses.save(q2);
    	
    	t.commit();
    	ses.close();
    	System.out.println("add successfully");
        
    }
}
