/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
 
/**
 *
 * @author MarkimOttey
 */
public class FileRead {
    String fname1=null;
    String lname1=null;
    String dob1=null;
    String age1=null;
    String sex1=null;
    String eFN1=null;
    String eLN1=null;
    String eTN1=null;
    String eZ1=null;
    
    //String[] text= new String[10];
        ArrayList <String> text = new ArrayList <String>();    
    public FileRead(String n){
        
        fname1=n;
        
        Scanner scanner = new Scanner( System.in );
        String key="6}c2f}FVcF3\\&&xB";
        
        //System.out.println("What is the Patiants name?");
        //String name = scanner.nextLine();
        
               try {
            try (FileReader reader = new FileReader("/Users/Akeso/"+fname1+".txt")) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                
                String line=null;
                int x=0;
                // String[] text= new String[10];
                //ArrayList <String> text = new ArrayList <String>();
                while ((line = bufferedReader.readLine()) != null) {
                    try {
                        line = Decryption.decrypt(line);
                        text.add(line);
                        //System.out.println(text[x]);
                        // x++;
                        //System.out.println(line);
                    } catch (Exception ex) {
                        Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
              
    }

    FileRead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<String> getText(){
        return text;
    }
    public void delete(String name){
        
        String fnam1=name;
        
             try
        {
            Files.deleteIfExists(Paths.get("/Users/Akeso/"+fname1+".txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
         
        System.out.println("Deletion successful.");
    }
    
    
}
