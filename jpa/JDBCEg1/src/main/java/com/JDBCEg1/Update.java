package com.JDBCEg1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root","root");
			Statement st= con.createStatement();
			st.executeUpdate("update student set sname='Jay' where sid=3 ");
    		System.out.println("Updated successfully ");
			ResultSet rs =st.executeQuery("select * from student");
			while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getInt(3));
		}
		con.close();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		}
}
