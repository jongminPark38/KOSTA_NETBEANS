
package ex1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex6_PrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            String path = "C:\\bigdataStudy\\java\\demo\\memo3.txt";
            // �ι�° ���� : autoFlush (�ڵ����� ������ ����ش�.)
             new FileWriter(path);
        pw = new PrintWriter(new FileOutputStream(path)
        ,true);
        pw.print("���� �ݰ���");
        pw.flush();
        } catch (Exception e) {
    } finally {
            pw.close();
        }
}
}