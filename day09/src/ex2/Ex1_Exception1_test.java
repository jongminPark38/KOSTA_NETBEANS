
package ex2;

import java.util.Scanner;


public class Ex1_Exception1_test {
    public static void main(String[] args) {
        System.out.println("���� �Է� :");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try{
            num =Integer.parseInt(sc.nextLine()); //���ܰ� �߻��Ҽ�����
            res = 10 / num;                       // ���ܰ� �߻��Ҽ� ����
              System.out.println("Res :" +res); //���� �߻��� ���� �ȵ�
        }catch (Exception e) {
            if(e instanceof ArithmeticException){
                
                System.out.println("0���� �������� �����ϴ�");
            }else if(e instanceof NumberFormatException){
                System.out.println("���ڸ� �Է��ϼ���.");
            }            // e���� ������ ó����ü�� �ּҰ�
            
       
           // System.out.println("���ڸ� �Է��ϼ���.");
       
             //System.out.println("0���� �������� �����ϴ�");
        }
             
        System.out.println("���� ����! ������ ����");                   
    }
}
