package com.sample.Trainmanagement;
import java.sql.*;


public class Database {
	static String url="jdbc:mysql://localhost:3306/anudip";
	static String username="root";
	static String password="anchal123";
	public static void mian(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
		    stmt.executeUpdate("select * from employee");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

