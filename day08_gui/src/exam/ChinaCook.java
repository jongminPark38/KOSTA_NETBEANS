package exam;

public class ChinaCook extends ChoiceFood implements OrderInter {

    private final String chinafood[] = {"�̰�", "������", "�Ⱥ�ä"};
    private String food;

    @Override
    public String order() {
        food = choice(chinafood);
        return "�߱� �丮�� �ֹ� :" + food;
    }
}
