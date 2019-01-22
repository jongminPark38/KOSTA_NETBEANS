
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
     //collection 에 object Type은 절대 추천하지 않으며
     // jdk5 부터 제네릭으로 사용한다 **
        for(Object e : list){
              //  예) integer : 30
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