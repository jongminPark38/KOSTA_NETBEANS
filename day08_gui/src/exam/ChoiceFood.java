package exam;


public class ChoiceFood {
    public String choice(String foods[]){
        // �Ѿ�� ������ �� ��ŭ
        int size = foods.length;
        // �������� ����
        int num = (int) (Math.random()*size);
        return foods[num];
    }
}
