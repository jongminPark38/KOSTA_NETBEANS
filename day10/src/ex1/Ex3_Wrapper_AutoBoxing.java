
package Ex1;

public class Ex3_Wrapper_AutoBoxing {
    public static void main(String[] args) {
        String str=new String("string");
        String str2="string";
         
        //wrapper class example
        //Integer num=new Integer("100");
        
        
        //JDK~ : auto,un boxing capable.
        //autoboxing : converts literal to an object
        Integer num=100;
        //unboxing : converts an object to literal value.
        int num3=num;
        int num4=num.intValue(); //obsolete
        int num2=(int) num.longValue();
        System.out.println(num+":"+num2);
    }
    
}