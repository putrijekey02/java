/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class config {
   private static Connection mysqlconfig;
   static Connection configDB () throws SQLException{
       try {
           String url="jdbc:mysql://localhost/penjualan";
           String user="root";
           String pass="";
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           mysqlconfig=DriverManager.getConnection(url, user, pass);    
       } catch (Exception e) {
           System.err.println("koneksi gagal"+e.getMessage());
       }
       return mysqlconfig;
   }
}
