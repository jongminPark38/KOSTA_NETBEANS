package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2_MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2_MemberJoinInter ref = new Ex2_MemberJoin() ;
        while(true){
            System.out.println("�޴� 1:�Է�, 2:���, 3:����");
            String menu = sc.nextLine();
            if(menu.equals("1")){
                //�Է°��� Map�� ����
                Map<String,String> map = new HashMap<>();
                System.out.println("���̵�"); // id
                map.put("id",sc.nextLine());
                System.out.println("�̸�");//name
                map.put("name",sc.nextLine());
                System.out.println("����");//name
                map.put("age",sc.nextLine());
                // Ex2_MEmberJoinInter �� �޴��߿� �޼��� ȣ���ؼ� �Է� ó�� => ArrayList�� ���� �ϴ� ���!
                ref.setAddMember(map);
            }else if(menu.equals("2")){
                //��¸޼��� ȣ�� �� Ex2_MemberJoinInter�� �ּҸ� ����
                printList(ref);
            }else{System.out.println("����");
            break;
            }
        }
    }

    private static void printList(Ex2_MemberJoinInter ref) {
ArrayList<Map<String,String>> map = ref.getList();
StringBuffer sb = new StringBuffer();
for(Map<String,String> e : map){
    sb.append("ID: ").append(e.get("id")).append("Wt");
    sb.append("Name: ").append(e.get("name")).append("Wt");
    sb.append("Age: ").append(e.get("age")).append("Wn");
}
        System.out.println(sb);
    }
}