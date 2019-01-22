
package ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex3_ObjectStream {
    public static void main(String[] args) throws IOException {
        String path = "C:\\bigdatastudy\\java\\demo";
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(path))){
            //직렬화 대상이 되는 객체 * (Serializable 인터페이스를 구현)
            Ex3_Member v = new Ex3_Member();
            v.setId("xman");
            v.setPwd("1");
            v.setAge(30);
            v.setName("김길동");
            v.setPay(2000);
            //직렬화
            oos.writeObject(v);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}