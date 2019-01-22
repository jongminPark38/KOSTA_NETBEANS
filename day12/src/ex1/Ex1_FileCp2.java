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
            
        
        bis = new FileInputStream(path1); //1����Ʈ�� �о��
        bos = new FileOutputStream(path2); //11����Ʈ�� �����Ѵ�.
        int readV = 0;
        //fis�� ���� 1byte�� �о� ���̸鼭
        //fos�� �о�� ��η� 1byte�� �����Ѵ�.
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
        System.out.println("������ �ð�" + (end - start));
    }
    
    
}