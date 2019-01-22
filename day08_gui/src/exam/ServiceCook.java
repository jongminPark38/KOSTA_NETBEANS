package exam;

public class ServiceCook extends MyMessageDemo implements ServiceInter{

    // ���� ����
    private OrderInter order;
    

    // cmd���� ���� ������ ��ü�� ����
    public String service(String name, String cmd) {
        // cmd�� "1"�϶�
        if (cmd.equals("1")) {
            order = new KoreaCook();
            // cmd�� "2"�϶�
        } else if (cmd.equals("2")) {
            order = new ChinaCook();
            // cmd�� "3"�϶�
        } else if (cmd.equals("3")) {
            order = new IndoCook();
        } else {
            // �� ����...
            order = new WrongOrder();
        }
        // ������ ��ü�� order�޼��带 ȣ��
        String menu = order.order();
        // �ֹ��� �ϴ� �����Ͻ� ����
        String msg = makeMessage(name, menu);
        // ���� msg�� ��ȯ
        return msg;
    }
}
