package ex1;

/**
 *
 * @author KOSTA
 */
public class MyMessageDemo {
    private StringBuffer sb;
    public String makeMessage(String name, String age, String addr){
        sb = new StringBuffer();
        sb.append("�̸� : " + name + "\n���� : " + age + "\n�ּ� : " + addr + "\n");
        return sb.toString();
    }
}
