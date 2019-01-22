package exam;

public class ChinaCook extends ChoiceFood implements OrderInter {

    private final String chinafood[] = {"»Ã∞≈", "∏∂∂Û≈¡", "∆»∫∏√§"};
    private String food;

    @Override
    public String order() {
        food = choice(chinafood);
        return "¡ﬂ±π ø‰∏Æ∏¶ ¡÷πÆ :" + food;
    }
}
