
package ex1;

import java.util.HashSet;
import java.util.Iterator;

public class Ex4_Set {
    public static void main(String[] args) {
       //set �������̽� - ������ ������� �ʴ� �ߺ����� �����ϴ� �÷���
       // �ߺ��� �����ϸ鼭 �ݺ���, ���� for�� �� ����
        HashSet<String> h1 = new HashSet<>();
       //TreeSet<String> h1 = new TreeSet<>(); //��������
        //LinkedHashSet<String> h1 = new LinkedHashSet<>(); //�Է¼�

        h1.add("ZTest");
        h1.add("BTest");
        h1.add("ATest");
        h1.add("CTest");
        h1.add("BTest");
        System.out.println("ũ�� :"+ h1.size());
        for(String e :h1){
            System.out.println(e);
        }
        System.out.println("-------------");
        Iterator<String> it = h1.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
    
}
