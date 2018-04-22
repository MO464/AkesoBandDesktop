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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarkimOttey
 */
public class FileWriter {
    String fname1=null;
    String lname1=null;
    String dob1=null;
   // String age1=null;
    String sex1=null;
    String eFN1=null;
    String eLN1=null;
    //String eTN1=null;
    //String eZ1=null;

    FileWriter(String usersAkesoshadowtxt, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void FileWriter(String fName, String lName, String dob, String sex ,String eFN, String eLN){
     final String USER = "Akeso" ;
     final String PASS = "Akeso";
     
     fname1=fName;
     lname1=lName;
    
     dob1=dob;
     //age1=age;
     sex1=sex;
     eFN1=eFN;
     eLN1=eLN;
     //eTN1=eTN;
     //eZ1=eZ;
        
        
        try{
            /**
            File file = new File ("/Users/Akeso/"+name+".txt");
            TextIO.write(myWeb,"txt", file);
            file.getParentFile().mkdir();
            file.createNewFile();
            **/
            Encryption Encryption = new Encryption();
      java.io.FileWriter writer;
            writer = new java.io.FileWriter ("/Users/Akeso/"+fname1+".txt");
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
          
                try {
                    
                    fname1 = Encryption.encrypt(fname1);
                    lname1 = Encryption.encrypt(lname1);
                   // age1 =Encryption.encrypt(age1);
                    dob1 =Encryption.encrypt(dob1);
                    sex1 = Encryption.encrypt(sex1);
                    eFN1 = Encryption.encrypt(eFN1);
                    eLN1 = Encryption.encrypt(eLN1);
                   // eTN1 = Encryption.encrypt(eTN1);
                   // eZ1 = Encryption.encrypt(eZ1);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TestWriter.class.getName()).log(Level.SEVERE, null, ex);
                }
                bufferedWriter.write(fname1);
                bufferedWriter.newLine();
                bufferedWriter.write(lname1);
                bufferedWriter.newLine();
                //bufferedWriter.write(age1);
                //bufferedWriter.newLine();
                bufferedWriter.write(dob1);
                bufferedWriter.newLine();
                bufferedWriter.write(sex1);
                bufferedWriter.newLine();
                bufferedWriter.write(eFN1);
                bufferedWriter.newLine();
                bufferedWriter.write(eLN1);
                bufferedWriter.newLine();
                //bufferedWriter.write(eTN1);
                //bufferedWriter.newLine();
                //bufferedWriter.write(eZ1);
                
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
