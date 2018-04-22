/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;

/**
 *
 * @author MarkimOttey
 */
public class TestWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner( System.in );
        
        System.out.println("What is the Patiants name?");
        String name = scanner.nextLine();
        
        System.out.println("What is the Patiants age?");
        String age= scanner.nextLine();
        
        System.out.println("What is the Patiants dob?");
        String dob = scanner.nextLine();
        
        String myWeb =name + "\r\n"+age+ "\r\n" + dob;
        
        
        try{
            /**
            File file = new File ("/Users/Akeso/"+name+".txt");
            TextIO.write(myWeb,"txt", file);
            file.getParentFile().mkdir();
            file.createNewFile();
            **/
            Encryption Encryption = new Encryption();
      FileWriter writer;
            writer = new FileWriter ("/Users/Akeso/"+name+".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            try {
          
                name = Encryption.encrypt(name);
                age =Encryption.encrypt(age);
                dob =Encryption.encrypt(dob);
            } catch (Exception ex) {
                Logger.getLogger(TestWriter.class.getName()).log(Level.SEVERE, null, ex);
            }
            writer.write(name);
           bufferedWriter.newLine();
           bufferedWriter.write(age);
          bufferedWriter.newLine();
           bufferedWriter.write(dob);
          bufferedWriter.newLine();
          
         bufferedWriter.close();
            
           }catch(IOException e){
           System.out.println("Something went wrong");
         }
            System.out.println("Success...");
    }
    
}
