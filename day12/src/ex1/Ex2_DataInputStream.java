package ex1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_DataInputStream {
    private String path;
    public Ex2_DataInputStream(){
path = "C:\\bigdatastudy\\java\\demo\\ex2_data.txt";    
}
    public void printDataStream() {
        try (DataInputStream fis 
                = new DataInputStream(new FileInputStream(path))){
            

        } catch (Exception ex) {
        }
        
    }
            
     public static void main(String[] args) {
        new Ex2_DataInputStream().printDataStream();
    }
    
    
}