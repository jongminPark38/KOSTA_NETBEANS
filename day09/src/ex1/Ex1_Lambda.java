
package ex1;

public class Ex1_Lambda {
    public static void main(String[] args) {
        // �͸� ���� Ŭ����
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");
            }
        };
        myInter.myMethod();
        System.out.println("-----------");
    // �ްԺ����� ���ϰ��� ���� void �ϰ�� ���ٽ�
        MyInter myInter1 =() ->{
            System.out.println("My Test1");
        };
        myInter1.myMethod();
        }
}
