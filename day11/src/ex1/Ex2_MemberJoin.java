
package ex1;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author KOSTA
 */
public class Ex2_MemberJoin implements Ex2_MemberJoinInter{
    private ArrayList<Map<String,String>> list;
    public Ex2_MemberJoin() {
        list = new ArrayList<>();
    }
    //�Էµ� �� ���� üũ�ϴ� �޼���
     private  boolean checkValue(){
         //Ư�� ���� �޾Ƽ� ���� ���� �ִ��� ������ üũ
         //�������� (���� ���� ���)
         return true;
     }
    //ȸ���� ������ �Է¹��� Map�� �ּҸ� list�� ����

    @Override
    public void setAddMember(Map<String, String> map) {
        if(!checkValue()){ //����Ŭ������ �ٽɱ���� �� �ִ�
            System.out.println("ȸ��������������");
        }
        list.add(map);
    }

    @Override
    public ArrayList<Map<String, String>> getList() {
        //�ļӱ���� �� �� �ִ�
        return list;
    
    }
}
