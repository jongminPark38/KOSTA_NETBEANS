
package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExampleTest {
    public static void main(String[] args) {
        
     List<String> list1;
     
     list1 = new ArrayList<>();
     
        System.out.println("1 or 2 를 입력");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        if(num==1){
            list1 = new ArrayList<>();
            elapsedTime(list1);
        }
        else{
            list1 = new LinkedList<>();
            elapsedTime(list1);
        }    
    
    }
 private static void elapsedTime(List<String> list){
        long startTime;
        long endTime;
        
        startTime=System.nanoTime();
        for(int i=0;i<100000;i++){
            list.add(String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.println(list.getClass().getSimpleName()+" 걸린시간 : "+(endTime-startTime)+" ns");
               
    }
}
