
package ex2;

import java.util.Scanner;


public class Ex1_Exception1_test {
    public static void main(String[] args) {
        System.out.println("수를 입력 :");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try{
            num =Integer.parseInt(sc.nextLine()); //예외가 발생할수있음
            res = 10 / num;                       // 예외가 발생할수 있음
              System.out.println("Res :" +res); //예외 발생시 실행 안됨
        }catch (Exception e) {
            if(e instanceof ArithmeticException){
                
                System.out.println("0으로 나눌수가 없습니다");
            }else if(e instanceof NumberFormatException){
                System.out.println("숫자만 입력하세요.");
            }            // e에는 예외의 처리객체의 주소값
            
       
           // System.out.println("숫자만 입력하세요.");
       
             //System.out.println("0으로 나눌수가 없습니다");
        }
             
        System.out.println("실행 종료! 마무리 영역");                   
    }
}
