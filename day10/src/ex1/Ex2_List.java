
package ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex2_List {
    private List list;
    public Ex2_List() {
    list = new ArrayList();
    list.add(new Integer(30));
    list.add(new Character('A'));
    list.add(new Float(3.14f));
    list.add("String");
        System.out.println("Size:" + list.size());
     //collection �� object Type�� ���� ��õ���� ������
     // jdk5 ���� ���׸����� ����Ѵ� **
        for(Object e : list){
              //  ��) integer : 30
                //    charactor : A
            if(e instanceof String){
                System.out.println("String" + e);
            }else if(e instanceof Integer){
                System.out.println("intger" +e);
            }//...
            //////////////////////////////////
            String obj = e.getClass().getCanonicalName();
            System.out.println(obj.substring(obj.lastIndexOf(",")+1)+":");
            System.out.println("e");
        }
        
    }
}