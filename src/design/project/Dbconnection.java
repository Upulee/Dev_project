/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.project;

import java.sql.DriverManager;

/**
 *
 * @author UPULEE
 */
public class Dbconnection {
    
Dbconnection(){
}
public java.sql.Connection getConnection(){
       try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con= DriverManager.getConnection(
               "jdbc:mysql://localhost:3308/project?autoReconnect=true&useSSL=false","root","123");
        return con;
    }
    catch(Exception e)
    { 
    	System.out.println(e);
    }
    return null;
  }
}

 

