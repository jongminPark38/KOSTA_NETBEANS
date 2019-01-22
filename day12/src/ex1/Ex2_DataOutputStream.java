package ex1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex2_DataOutputStream {
    private String path;
    public Ex2_DataOutputStream(){
        path = "C:\\bigdatastudy\\java\\demo\\ex2_data.txt";
    }
    //DataType과 함께 입력을 처리하는 메서드
    public void dataWrite(){
        //자동으로 close 수행함! 버전 주의!!
        try(DataOutputStream dos = 
                new DataOutputStream(new FileOutputStream(path))){
            //입력 순서가 매우 중요함!
            dos.writeInt(10);
            dos.writeBoolean(true);
            dos.writeChar('A');
            dos.writeFloat(10.5f);
            dos.writeUTF("MyTest");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex2_DataOutputStream().dataWrite();
        
    }
}