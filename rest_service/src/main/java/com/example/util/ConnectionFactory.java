package com.example.util;



import java.sql.*;
import java.util.ResourceBundle;
public class ConnectionFactory {
   public static Connection getOracleConnection()
   {
	   Connection con=null;
	   ResourceBundle lables=ResourceBundle.getBundle("application");
	   try {
		   
		   con=DriverManager.getConnection(lables.getString("dataSource.oracle.url"),
				   lables.getString("dataSource.oracle.username"),
				   lables.getString("dataSource.oracle.password"));
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return con;
	   
   }
   
   
   
   public static Connection getPostgressConnection()
   {

	   Connection con=null;
	   //2...Alternate way of creating Connection
	  
	   try {
		  ResourceBundle lables=ResourceBundle.getBundle("application");
		 con=DriverManager.getConnection(lables.getString("dataSource.postgres.url"),
				   lables.getString("dataSource.postgres.username"),
				   lables.getString("dataSource.postgres.password"));
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return con;
	   

	   
   }
}
