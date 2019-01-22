
package ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_Excption {
    public static void main(String[] args) {
        try {
            //컴파일시 예외는 주로 장치나, 외부 드라이버 관련
            //컴파일러가 인지하는 예외이다
            Thread.sleep(5000);
            System.out.println("Test");
        } catch (InterruptedException ex) {
            //예외가 발생했을 ? 개발자가 확인할 수 있는 메세지 (좌측 try)
            ex.printStackTrace();
        }
    }
    
}
