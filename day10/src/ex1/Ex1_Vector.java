
package Ex1;

import java.util.Iterator;
import java.util.Vector;


public class Ex1_Vector {
    public Ex1_Vector(){
        
      
        Vector v=new Vector();
        System.out.println("Initial capacity : "+v.capacity());
        System.out.println("Initial size : "+v.size());
        
        v.add("Test1");
        v.add("Test2");
        v.add("Test1");
        v.add("Test1");
        v.add("Test2");
        v.add("Test1");v.add("Test1");
        v.add("Test2");
        v.add("Test1");v.add("Test1");
        v.add("Test2");
        v.add("Test1");v.add("Test1");
        v.add("Test2");
        v.add("Test1");
        v.add("Test2");
        v.add("Test1");v.add("Test1");
        v.add("Test2");
        v.add("Test1");v.add("Test1");
        v.add("Test2");
        v.add("Test1");
        
        System.out.println("Capacity changed : "+v.capacity());
        System.out.println("Size changed : "+v.size());
        
      
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("=================");
        
     
        for(Object e : v){
            System.out.println(e);
        }
        
        Iterator it=v.iterator();
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }
        
                
    }
    public static void main(String[] args) {
        Ex1_Vector ex=new Ex1_Vector();
    }
}