
package ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_Excption {
    public static void main(String[] args) {
        try {
            //�����Ͻ� ���ܴ� �ַ� ��ġ��, �ܺ� ����̹� ����
            //�����Ϸ��� �����ϴ� �����̴�
            Thread.sleep(5000);
            System.out.println("Test");
        } catch (InterruptedException ex) {
            //���ܰ� �߻����� ? �����ڰ� Ȯ���� �� �ִ� �޼��� (���� try)
            ex.printStackTrace();
        }
    }
    
}
