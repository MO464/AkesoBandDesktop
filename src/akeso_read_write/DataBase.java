/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author MarkimOttey
 */
public class DataBase {
    String name=null;
    String firstName;
    String lastName;
    String sex;
    
    public DataBase(String n ){
        name=n;
        
    
        
     final String USER = "Akeso" ;
     final String PASS = "Akeso";

          int count=0;
          final String DB_URL = "jdbc:derby://localhost:1527/Medical_Records"; 
          
          Scanner keyboard = new Scanner(System.in);
          

        
          try {
            
              Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
              
              Statement stmt = conn.createStatement();
              
              String sqlStatement = "SELECT * FROM PATIENT_RECORDS WHERE First_Name='"+name+"'"
                                    ;
             
              ResultSet result = stmt.executeQuery(sqlStatement);
              
              while (result.next()){
                 
                          //if (name.equals(result.getString("First_Name"))){
                         firstName=result.getString("First_Name");
                         lastName= result.getString("Last_Name");
                         sex=  result.getString("Sex");
  
                          //}
              }
              //System.out.println(count + " Records found");
              
              conn.close();
        } catch (Exception e) {
            System.out.println("ERROR" +e.getMessage());
        }
    }

    public String getFName(){
        return firstName;
    }
    
    public String getLName(){
        return lastName;
    }
    public String getSex(){
        return sex;
    }
    
}

