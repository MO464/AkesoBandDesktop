/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarkimOttey
 */
public class userW {
    
    public userW(String U, String P) throws IOException{
        
        String user=U;
        String pass=P;
        
        /**
         * 
         * try(FileWriter fw = new FileWriter("/Users/Akeso/shadow.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
   {
    out.println("the text");
    //more code
    out.println("more text");
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
         */
        
           
      Encryption Encryption = new Encryption();
        //java.io.FileWriter writer = null;
        FileWriter writer = new java.io.FileWriter ("/Users/Akeso/shadow.txt");
            
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                   PrintWriter out = new PrintWriter(bufferedWriter);
                try {
                    
                    user = Encryption.encrypt(user);
                    pass = Encryption.encrypt(pass);
              
                    
                } catch (Exception ex) {
                    Logger.getLogger(TestWriter.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 out.println(user);
                 out.println(pass);
                
                bufferedWriter.close();
                
            
           }catch(IOException e){
           System.out.println("Something went wrong");
         }
            System.out.println("Success...");
    }

    }

    

