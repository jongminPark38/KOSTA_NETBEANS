package exam;

public class KoreaCook extends ChoiceFood implements OrderInter {

    private final String korfood[] = {"�����", "��ġ�", "�����"};
    private String food;
    
    

    public String order() {
        food = choice(korfood);
        return ("�ѱ� �丮�� �ֹ� : " + food);
    }
}
