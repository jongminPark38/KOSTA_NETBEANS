package exam;

import java.util.Scanner;

public class CookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceCook service = new ServiceCook();
        while (true) {
            System.out.print("�ֹ��� �̸� : ");
            String name = sc.nextLine();
            System.out.print("1.�ѱ��丮 2.�ε��丮 3.�߱��丮 : ");
            String menu = sc.nextLine();
            service.service(name, menu);
            System.out.println("-----------------------------");
        }

    }
}
