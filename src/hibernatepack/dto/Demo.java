package hibernatepack.dto;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
public static void main(String[] args) {
	System.out.println("Started");
	String url = "jdbc:mysql://localhost:3306/hibernatedb?useSSL=false";
	String user = "hbstudent";
	String pass = "hbstudent";
	try{
		Connection conn = DriverManager.getConnection(url,user,pass);
		System.out.println("Success");
	}
	catch(Exception e)
	{}
}
}
