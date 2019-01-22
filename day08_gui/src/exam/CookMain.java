package exam;

import java.util.Scanner;

public class CookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceCook service = new ServiceCook();
        while (true) {
            System.out.print("주문자 이름 : ");
            String name = sc.nextLine();
            System.out.print("1.한국요리 2.인도요리 3.중국요리 : ");
            String menu = sc.nextLine();
            service.service(name, menu);
            System.out.println("-----------------------------");
        }

    }
}
