package exam;

public class IndoCook extends ChoiceFood implements OrderInter {

    private final String indofood[] = {"ī��", "��", "ź�θ�"};
    private String food;

    public String order() {
        food = choice(indofood);
        return ("�ε� �丮�� �ֹ� :" + food);
    }
}
