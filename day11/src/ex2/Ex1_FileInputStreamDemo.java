/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_FileInputStreamDemo {
    
    public static void main(String[] args) {

        String path="C:\\bigdataStudy\\java\\demo\\meseage.txt";

        FileInputStream fis=null;
       try {
             fis=new FileInputStream(path);
             int rdv=0;

             while((rdv=fis.read())!=-1){
                 System.out.println((char)rdv);
             }
        } catch (FileNotFoundException ex) {
            System.out.println("ÆÄÀÏ¾ø");
        } catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Error while reading contents of file");
        } finally{
           if(fis!=null){
               try {
                   fis.close();
               } catch (IOException ex) {
                   Logger.getLogger(Ex1_FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
    }
}