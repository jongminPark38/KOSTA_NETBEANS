
package ex2;


public class Ex3_Excption {
    private int [] var = {100, 200, 300}; 
            public Ex3_Excption() {
try { 
    for (int i = 0; i<=var.length; i++ ){
        System.out.println(i+ ""+var[i]);        
}         
    }catch (Exception e) {
    e.printStackTrace();
            System.out.println("배열의 범위를 넘었습니다");
            return;
            
}finally {
            System.out.println("실행종료 ! final 마무리 영역);

}
System.out.println("실행종료 마무리 영역");
}
}