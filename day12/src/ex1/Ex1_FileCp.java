package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1_FileCp {
 
    public static void main(String[] args) throws  IOException,IOException{
        long start = System.currentTimeMillis();
        String path1 = "C:\\bigdataStudy\\java\\jdk.exe";
        String path2 = "C:\\bigdataStudy\\java\\myjdk.exe";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            
        
        fis = new FileInputStream(path1); //1����Ʈ�� �о��
        fos = new FileOutputStream(path2); //11����Ʈ�� �����Ѵ�.
        int readV = 0;
        //fis�� ���� 1byte�� �о� ���̸鼭
        //fos�� �о�� ��η� 1byte�� �����Ѵ�.
        while((readV = fis.read()) != -1){
            fos.write(readV);
        }
        
        }   catch(FileNotFoundException ex){
        }   catch(IOException ex){
            
        } finally{
            if(fis != null) fis.close();
            if(fos != null) fos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("������ �ð�" + (end - start));
    }
    
    
}