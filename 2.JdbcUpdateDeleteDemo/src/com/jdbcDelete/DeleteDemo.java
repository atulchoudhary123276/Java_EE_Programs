//---------------youtube playlist videos smartPrograming video no-03

package com.jdbcDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception{
    String email1="anoml@gmail.com";

	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	   PreparedStatement ps= con.prepareStatement("delete from register where email=?");
	   ps.setString(1, email1);
	   
	   int count=ps.executeUpdate();
	   if(count>0) {
		   System.out.println("deleted sucessfully");
	   }
	   else {
		   System.out.println("failed");

	}
	   con.close();
	}

}
