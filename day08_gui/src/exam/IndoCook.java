package exam;

public class IndoCook extends ChoiceFood implements OrderInter {

    private final String indofood[] = {"카레", "난", "탄두리"};
    private String food;

    public String order() {
        food = choice(indofood);
        return ("인도 요리를 주문 :" + food);
    }
}
