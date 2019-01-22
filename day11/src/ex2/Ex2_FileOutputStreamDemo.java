
package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        String path = "C:\\bigdataStudy\\java\\demo\\mesage.txt";
        FileOutputStream fos = null;
        try{ 
            fos = new FileOutputStream(path,true);
        fos.write(66);
        fos.write(65);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }finally{
            if(fos  != null) fos.close();
        }
      
        
       
        
    }
}
