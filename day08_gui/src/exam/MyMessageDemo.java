package exam;

import ex1.*;


public class MyMessageDemo {

    private StringBuffer sb;

    public MyMessageDemo() {
        sb = new StringBuffer();
    }

    public String makeMessage(String name, String msg) {
        sb.append(name + "���� " + msg + "\n");
        return sb.toString();
    }
}
