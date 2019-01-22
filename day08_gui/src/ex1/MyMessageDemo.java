package ex1;

/**
 *
 * @author KOSTA
 */
public class MyMessageDemo {
    private StringBuffer sb;
    public String makeMessage(String name, String age, String addr){
        sb = new StringBuffer();
        sb.append("이름 : " + name + "\n나이 : " + age + "\n주소 : " + addr + "\n");
        return sb.toString();
    }
}
