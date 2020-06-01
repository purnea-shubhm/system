/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplexTree.Db;
    import java.sql.*;
/**
 *
 * @author India
 */
public class ConnectionDb {
  private final static String user="root";
  private final static String pwd="root";
  private final static String Driver="com.mysql.jdbc.Driver";
  private final static String url="jdbc:mysql://localhost:3306/shubham";
  private static Connection conn= null;
  static{
      try {
          Class.forName(Driver);
          conn=DriverManager.getConnection(url, user, pwd);
      } catch (Exception e) {
          System.out.println("Exception cught at ConnectDb() + "+e);
      }
  }
  public static Connection conn(){
  return conn;
  }
    public static void main(String[] args) {
        System.out.println(conn);
    }
            
}
