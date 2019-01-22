
package ex1;

public class Ex2_Lambda {
    
     public Ex2_Lambda(MyInter1 myInter1) {
     myInter1.myMethod(200);
 }   
    
    public static void main(String[] args) {
        new MyInter1() {
            @Override
            public void myMethod(int argN) {
                int res = argN * 2 ;
                System.out.println("Result1: " + res);
        }
    } .myMethod(100);
     Ex2_Lambda ref = new Ex2_Lambda((argN)-> {
         int res = argN * 2;
         System.out.println("result2: " + res);
});
      MyInter1 myInter2 = argN ->
              System.out.println("Result3: " +argN*2);
        myInter2.myMethod(0);
 
    }

}