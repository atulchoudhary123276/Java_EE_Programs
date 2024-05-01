//---------------youtube playlist videos smartPrograming video no-02
package com.jdbcPractice;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
   public static void main(String[] args) throws Exception{
	   //----------user values----
	   String name1="anmol";
	   String email1="anoml@gmail.com";
	   String pass1="anmol123";
	   String gender1="male";
	   String city1="dehradun";
	   //---database connection in 6 steps
	   Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	  //----insert query----
	  PreparedStatement ps=con.prepareStatement("insert into register value(?,?,?,?,?)"); //positional parameters?
	  ps.setString(1, name1);
	  ps.setString(2, email1);
	  ps.setString(3, pass1);
	  ps.setString(4, gender1);
	  ps.setString(5, city1);



	  int i=ps.executeUpdate();
	  if(i>0) {
		  
		  System.out.println("sucessfully inserted value");
	  }
	  else {
		  System.out.println("fail to insert");
	  }
	  con.close();
	   
   }
}
