
package ex2;


public class Ex2_MyRunnable implements Runnable{
    //Thread�� ������ Ŭ�����̱� ������ �߻�޼����� run()��
    //������ �ִ�. ���� getName()�� ����Ϸ���
    //���� �������� �ּҸ� �����ͼ� �Ʒ�ó�� ����Ѵ�.
    @Override
    public void run() {
    // ������ ���ÿ��� run()ȣ��� �������� �ּ� ��.    
         System.out.println("@-------@" + Thread.currentThread().getName());
    }

}
    

