
package ex2;


public class Ex2_MyRunnable implements Runnable{
    //Thread를 구현한 클래스이기 때문에 추상메서드인 run()만
    //가지고 있다. 따라서 getName()을 사용하려면
    //현재 쓰레드의 주소를 가져와서 아래처럼 사용한다.
    @Override
    public void run() {
    // 쓰레드 스택에서 run()호출된 스레드의 주소 값.    
         System.out.println("@-------@" + Thread.currentThread().getName());
    }

}
    

