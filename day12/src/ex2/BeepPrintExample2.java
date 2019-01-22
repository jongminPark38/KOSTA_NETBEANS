
package ex2;

import java.awt.Toolkit;

public class BeepPrintExample2 {
    // 스레드를 익명 내부클래스로 정의하는 방법
        public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++){
                    toolkit.beep();
                  try{
                      Thread.sleep(500);
                  } catch (Exception e) { 
                }
            }
            
        }
    };
    thread.start();
    
    for(int i = 0; i < 5; i++){
        System.out.println("띵");
        try{
            thread.sleep(500);
        }catch (Exception e){
    }
    }
        }
}