package exam;

public class KoreaCook extends ChoiceFood implements OrderInter {

    private final String korfood[] = {"된장찌개", "김치찌개", "비빔밥"};
    private String food;
    
    

    public String order() {
        food = choice(korfood);
        return ("한국 요리를 주문 : " + food);
    }
}
