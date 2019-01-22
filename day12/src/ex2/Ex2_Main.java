
import ex2.Ex2_MyRunnable;
import ex2.Ex2_MyThread1;

public class Ex2_Main {
    //������� ������ ����, ����Ǵ� ������ ��Ȯ���� �ʴ�.
    public static void main(String[] args) {
        Ex2_MyThread1 em = new Ex2_MyThread1();
        em.start();
        //������ ����� �ٷ� Ƣ��´�.
        //em.start();
        /*
        runnable
        -> start
        -> runable
        -> run
        -> running
        ->dead����
        running���� runable�� �ٽ� ���ư� �� �ִ�.
        start�� ������ �Ұ����ϴ�. 1���� ȣ���� �����ϴ�.
        */
        //Runnable �������̽��� ������ Ŭ����
        Thread t1 = new Thread(new Ex2_MyRunnable());
        t1.start();
        //���θ޼��忡�� �����ð��� �ֱ� ���ؼ� �ݺ�
        for(int i = 0; i < 10; i++){
            System.out.println(i + " \t");
        }
        
    }
}