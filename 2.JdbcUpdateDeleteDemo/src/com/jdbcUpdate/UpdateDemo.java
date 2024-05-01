//---------------youtube playlist videos smartPrograming video no-03

package com.jdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception{
    String email1="atul@gmail.com";
	String city1="pune";
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	   PreparedStatement ps= con.prepareStatement("update register set city=? where email=?");
	   ps.setString(1, city1);
	   ps.setString(2, email1);
	   
	   int count=ps.executeUpdate();
	   if(count>0) {
		   System.out.println("updated sucessfully");
	   }
	   else {
		   System.out.println("updation fail");

	}
	   con.close();
	}

}
