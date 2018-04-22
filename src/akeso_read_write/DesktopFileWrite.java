/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarkimOttey
 */
public class DesktopFileWrite {
        String name=null;
        String allergies=null;
        String medicalC=null;
        String medications=null;
        String eName=null;
        String ePhone=null;
        String iProvider=null;
        String iId=null;
        String cNotes=null;
        String bCode=null;
        
    public void DataBaseWrite(String name1, String allergies1, String medicalC1, String medications1, String eName1, String ePhone1, String iProvider1, String iId1, String cNotes1, String bCode1 ){
        
     final String USER = "Akeso" ;
     final String PASS = "Akeso";
     
        name=name1;
        allergies=allergies1;
        medicalC=medicalC1;
        medications=medications1;
        eName=eName1;
        ePhone=ePhone1;
        iProvider=iProvider1;
        iId=iId1;
        cNotes=cNotes1;
        bCode=bCode1;
        
        
        
     try{
            /**
            File file = new File ("/Users/Akeso/"+name+".txt");
            TextIO.write(myWeb,"txt", file);
            file.getParentFile().mkdir();
            file.createNewFile();
            **/
            Encryption Encryption = new Encryption();
      java.io.FileWriter writer;
            writer = new java.io.FileWriter ("/Users/Akeso/"+bCode+".txt");
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
          
                try {
                    
                    name1 = Encryption.encrypt(name1);
                    allergies1 = Encryption.encrypt(allergies1);
                   medicalC1 =Encryption.encrypt(medicalC1);
                    medications1 =Encryption.encrypt(medications1);
                    eName1 = Encryption.encrypt(eName1);
                    ePhone1 = Encryption.encrypt(ePhone1);
                    iProvider1 = Encryption.encrypt(iProvider1);
                   iId1 = Encryption.encrypt(iId1);
                   cNotes1 = Encryption.encrypt(cNotes1);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TestWriter.class.getName()).log(Level.SEVERE, null, ex);
                }
                bufferedWriter.write(name1);
                bufferedWriter.newLine();
                bufferedWriter.write(allergies1);
                bufferedWriter.newLine();
                bufferedWriter.write(medicalC1);
                bufferedWriter.newLine();
                bufferedWriter.write(medications1);
                bufferedWriter.newLine();
                bufferedWriter.write(eName1);
                bufferedWriter.newLine();
                bufferedWriter.write(ePhone1);
                bufferedWriter.newLine();
                bufferedWriter.write(iProvider1);
                bufferedWriter.newLine();
                bufferedWriter.write(iId1);
                bufferedWriter.newLine();
                bufferedWriter.write(cNotes1);
                
                bufferedWriter.close();
                
            }
           }catch(IOException e){
           System.out.println("Something went wrong");
         }
            System.out.println("Success...");
    }

    String[] getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
