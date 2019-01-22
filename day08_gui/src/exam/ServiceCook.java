package exam;

public class ServiceCook extends MyMessageDemo implements ServiceInter{

    // 변수 선언
    private OrderInter order;
    

    // cmd값에 대한 각각의 객체를 생성
    public String service(String name, String cmd) {
        // cmd가 "1"일때
        if (cmd.equals("1")) {
            order = new KoreaCook();
            // cmd가 "2"일때
        } else if (cmd.equals("2")) {
            order = new ChinaCook();
            // cmd가 "3"일때
        } else if (cmd.equals("3")) {
            order = new IndoCook();
        } else {
            // 그 외의...
            order = new WrongOrder();
        }
        // 생성된 객체의 order메서드를 호출
        String menu = order.order();
        // 주문을 하는 비지니스 로직
        String msg = makeMessage(name, menu);
        // 최종 msg를 반환
        return msg;
    }
}
