
package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex1_Map {
    // Map�� key, value�� �����ϴ� ����
    public static void main(String[] args) {
        // Map�� ������ �迭��
        String[] msg = {"AA","BB", "CC", "AA", "DD", "EE", "FF"};
        HashMap < Integer, String > map = new HashMap<>();
        int cnt = 0;  //�迭�� ���� index��
        // �迭�� ������ŭ Map�� ����
        for(String e : msg){
            map.put(cnt+1 , e); // cnt + 1 : Map�� Ű���� 1����
            cnt++;
        }
        System.out.println("Map"+map.size());
        // Map.Entry < Integer, String > : key �� value�� �޾ƿ��� ����
        // �������̽� , �ڷ��� -> e key.value �����ϴ� ��ü �ּ�
        // enterSet() : ket, value  �� ���� ���� Map.Entry < Integer, String > 
        // �����ؼ� ��ȯ�Ѵ�
      for(Map.Entry < Integer, String > e : map.entrySet()){
          System.out.println("Key:" +e.getKey());
          System.out.println("Valye: " +e.getValue());
      }
    }
         
    
}
