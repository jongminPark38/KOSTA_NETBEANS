
package ex1;

public class Ex1_Lambda {
    public static void main(String[] args) {
        // 익명 내부 클래스
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");
            }
        };
        myInter.myMethod();
        System.out.println("-----------");
    // 메게변수와 리턴값이 없는 void 일경우 람다식
        MyInter myInter1 =() ->{
            System.out.println("My Test1");
        };
        myInter1.myMethod();
        }
}
