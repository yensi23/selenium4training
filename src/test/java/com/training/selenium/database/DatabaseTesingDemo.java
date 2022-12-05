package com.training.selenium.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
 
public class DatabaseTesingDemo {
       // Connection object
       static Connection con = null;
       // Statement object
       private static Statement stmt;
       // Constant for Database URL
       public static String DB_URL = "jdbc:mysql://localhost:3306/user";   
       // Constant for Database Username
       public static String DB_USER = "root";
       // Constant for Database Password
       public static String DB_PASSWORD = "123456";
 
       @SuppressWarnings("deprecation")
	   @BeforeAll
       public void setUp() throws Exception {
    	   System.out.println("Starting connection");
    	   try{
                     // Make the database connection
                     String dbClass = "com.mysql.jdbc.Driver";
                     Class.forName(dbClass).newInstance();
                     // Get connection to DB
                     Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                     // Statement object to send the SQL statement to the Database
                     stmt = con.createStatement();
                     }
             catch (Exception e)
             {
                   e.printStackTrace();
             }
    	   System.out.println("Connection established");
       }
 
       @Test
       public void test() {
              try{
              String query = "select * from userinfo";
              // Get the contents of userinfo table from DB
              ResultSet res = stmt.executeQuery(query);
              // Print the result untill all the records are printed
              // res.next() returns true if there is any next record else returns false
              while (res.next())
              {
                     System.out.print(res.getString(1));
              System.out.print("\t" + res.getString(2));
              System.out.print("\t" + res.getString(3));
              System.out.println("\t" + res.getString(4));
              }
              }
              catch(Exception e)
              {
                     e.printStackTrace();
              }     
       }
 
       @AfterAll
       public void tearDown() throws Exception {
              // Close DB connection
              if (con != null) {
              con.close();
              }
       }
}