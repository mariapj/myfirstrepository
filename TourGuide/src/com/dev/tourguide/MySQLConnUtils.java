package com.dev.tourguide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class MySQLConnUtils {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  if( getMySQLConnection()!=null)
		  System.out.println("your ");
  }
 public static Connection getMySQLConnection()
         throws ClassNotFoundException, SQLException {
     String hostName = "localhost";
     String dbName = "myfirst";
     String userName = "root";
     String password = "root123";
     return getMySQLConnection(hostName, dbName, userName, password);
 }
  
 public static Connection getMySQLConnection(String hostName, String dbName,
         String userName, String password) throws SQLException,
         ClassNotFoundException {
    
     Class.forName("com.mysql.cj.jdbc.Driver");
     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName+"?autoReconnect=true&useSSL=false";
     Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
}
