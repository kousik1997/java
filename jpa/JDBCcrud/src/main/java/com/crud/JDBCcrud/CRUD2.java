package com.crud.JDBCcrud;
import java.sql.*;
import java.util.Scanner;
public class CRUD2 {
	 public static void main( String[] args )
	    {
	    	try {
	    		int ch,sid,sage;
	    char ans;
	    		String sname;
	    		Class.forName("com.mysql.cj.jdbc.Driver");	    		
	    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "root");	    		
	    		Statement st = con.createStatement();
	    	
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("chouse any");
	    		do {
	    			System.out.println("What are you doing");	    		
				System.out.println("1:vew deta");
				System.out.println("2:insert deta");
				System.out.println("3:update deta");
				System.out.println("4:Delete deta");
				System.out.println("5: Exit");
				
				ch=Integer.parseInt(sc.nextLine());
				switch(ch)
				{
				case 1:
	    		ResultSet rs = st.executeQuery("select * from student");
	    		while(rs.next()) {
	    			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getInt(3));
	    			
	    		}
	    		break;
				case 2:
					System.out.println("how meny deta you want to insert");
					int n=Integer.parseInt(sc.nextLine());
					for (int i = 0; i < n; i++) {
						System.out.println("Enter id");
						sid =Integer.parseInt(sc.nextLine());
						System.out.println("Enter your name");
						sname=sc.nextLine();
						System.out.println("Enter your age");
						sage=Integer.parseInt(sc.nextLine());
						st.executeUpdate("insert into Student values(" + sid + ", '" + sname + "', " + sage + ")");
						System.out.println("record inserted");
					}
						
					break;
				case 3:
					System.out.println("Enter id");
					sid = Integer.parseInt(sc.nextLine());
					System.out.println("Enter your name");
					sname=sc.nextLine();
					System.out.println("Enter your age");
					sage = Integer.parseInt(sc.nextLine());
					st.executeUpdate("update Student set sage='" + sage + "',sname='" + sname + "' where sid =" + sid);
					
					System.out.println("record updated");
					break;
					
				case 4:
					System.out.println("Enter id");
					sid = Integer.parseInt(sc.nextLine());
					st.executeUpdate("delete from Student where sid=" + sid);
					System.out.println("record deleted");
					break;

				case 5:
					System.out.println("exit");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice");
						break;

				}
	    		System.out.println("Do you want to work some more items y/n");
				ans=sc.next().charAt(0);
	    		}
	    		while(ans=='y' ||ans=='Y');
	    		System.out.println("Thank You");
	    		con.close();
	    		
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
	    }
}
	    
