
package ex1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex6_PrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            String path = "C:\\bigdataStudy\\java\\demo\\memo3.txt";
            // 두번째 인자 : autoFlush (자동으로 버프를 비워준다.)
             new FileWriter(path);
        pw = new PrintWriter(new FileOutputStream(path)
        ,true);
        pw.print("하이 반갑습");
        pw.flush();
        } catch (Exception e) {
    } finally {
            pw.close();
        }
}
}