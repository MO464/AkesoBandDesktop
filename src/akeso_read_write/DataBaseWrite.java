/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarkimOttey
 */
public class DataBaseWrite {
    String fname1=null;
    String lname1=null;
    String dob1=null;
    String age1=null;
    String sex1=null;
    String eFN1=null;
    String eLN1=null;
    String eTN1=null;
    String eZ1=null;
            
    public void DataBaseWrite(String fName, String lName, String dob, String age, String sex ,String eFN, String eLN, String eSN, String eTN, String eZ ){
        
     final String USER = "Akeso" ;
     final String PASS = "Akeso";
     
     fname1=fName;
     lname1=lName;
    
     dob1=dob;
     age1=age;
     sex1=sex;
     eFN1=eFN;
     eLN1=eLN;
     eTN1=eTN;
     eZ1=eZ;
     
     String First_name="FIRST_NAME";
     String Last_name="LAST_NAME";
     String DOB="DOB";
     String AGE="AGE";
     String Sex="SEX";
     String EMERGENCY_CONTACT_FIRST_NAME="EMERGENCY_CONTACT_FIRST_NAME";
     String EMERGENCY_CONTACT_LAST_NAME="EMERGENCY_CONTACT_LAST_NAME";
     String STREET_NAME="STREET_NAME";
     String TOWN_NAME="TOWN_NAME";
     String ZIPCODE="ZIPCODE";
     
          int count=0;
          final String DB_URL = "jdbc:derby://localhost:1527/Medical_Records"; 
          
          Scanner keyboard = new Scanner(System.in);
          
          System.out.println("What is the persons name?");
          String name = keyboard.nextLine();
        
          try {
            //insert into PATIENT_RECORDS ("FIRST_NAME","LAST_NAME") values ('Bill','Klingler');
              Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
              
              Statement stmt = conn.createStatement();
              
              String sqlStatement = "insert into PATIENT_RECORDS ("+First_name+","+Last_name+","+DOB+","+Sex+","+EMERGENCY_CONTACT_FIRST_NAME+","+EMERGENCY_CONTACT_LAST_NAME+","+STREET_NAME+","+TOWN_NAME+","+ZIPCODE+") values "
                      + "                                      ('"+fname1+"','"+lname1+"','"+dob1+"','"+age1+"','"+sex1+"','"+eFN1+"','"+eLN1+"','"+eTN1+"','"+eZ1+"')";
             

              
              conn.close();
        } catch (Exception e) {
            System.out.println("ERROR" +e.getMessage());
        }
          
    }
    public String getFname(){
        return fname1; 
    }
    public String getLname(){
        return lname1;
    }
    public String getdob(){
        return dob1;
    }
    public String getAge(){
        return age1;
    }
    public String getSex(){
        return sex1;
    }
    public String getEfn(){
        return eFN1;
    }
    public String getEln(){
        return eLN1;
    }
    public String getETN(){
        return eTN1;
    }
    public String getEZ1(){
        return eZ1;
    }
    

}

