
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
            System.out.println("�迭�� ������ �Ѿ����ϴ�");
            return;
            
}finally {
            System.out.println("�������� ! final ������ ����);

}
System.out.println("�������� ������ ����");
}
}