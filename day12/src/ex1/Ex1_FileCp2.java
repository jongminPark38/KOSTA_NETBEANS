package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class Ex1_FileCp2 {
 
    public static void main(String[] args) throws  IOException,IOException{
        long start = System.currentTimeMillis();
        String path1 = "C:\\bigdataStudy\\java\\jdk.exe";
        String path2 = "C:\\bigdataStudy\\java\\myjdk.exe";
        FileInputStream bis = null;
        FileOutputStream bos = null;
        try{
            
        
        bis = new FileInputStream(path1); //1바이트씩 읽어내고
        bos = new FileOutputStream(path2); //11바이트씩 저장한다.
        int readV = 0;
        //fis로 부터 1byte씩 읽어 들이면서
        //fos로 읽어온 경로로 1byte씩 저장한다.
        while((readV = bis.read()) != -1){
            bos.write(readV);
        }
        
        }   catch(FileNotFoundException ex){
        }   catch(IOException ex){
            
        } finally{
            if(bis != null) bis.close();
            if(bos != null) bos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("복사한 시간" + (end - start));
    }
    
    
}