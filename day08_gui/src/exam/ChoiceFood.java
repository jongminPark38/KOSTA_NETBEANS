package exam;


public class ChoiceFood {
    public String choice(String foods[]){
        // 넘어온 음식의 수 만큼
        int size = foods.length;
        // 랜덤값을 얻음
        int num = (int) (Math.random()*size);
        return foods[num];
    }
}
