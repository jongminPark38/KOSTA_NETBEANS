
package ex2;

import java.io.File;
import java.io.IOException;
import javafx.fxml.LoadException;

public class Ex1_File {
// ù��° ���
    public static void main(String[] args) {
        String path = "C:\\bigdataStudy\\java\\demo\\demo.txt";
        //���� ��ü�� ���� : �ش� �����̳� ��ΰ� ��� �߻����� ��� ����
        File f = new File(path);
        // �ֿ� �޼��� ����
        System.out.println("demo.txt�� �����ϴ°�?" + f.exists());
        if(f.exists()){
            System.out.println("��");
            }
        System.out.println("demo.txt�� �����ΰ�?" + f.isFile());
        System.out.println("�����̰� �����Ѱ�?" + f.canExecute());
        System.out.println("�ۼ��� �����Ѱ�?" + f.canWrite());
        System.out.println("������" + f.getAbsolutePath());
        System.out.println("");
        //�ι�? ���
        // ��� �������� �ʾƵ� ���� �ȳ�
        File f2 = new File("C:\\bigdataStudy\\java\\demo\\aa.txt");
        if (!f2.exists()){ //������ �������� ����?
            try {
                System.out.println("���� aa�� �����");
                f2.createNewFile();
            }  catch (IOException ex) {
                ex.printStackTrace();
            }
            }else {
            System.out.println("�̹� ����");
        }
         File f3 = new File("C:\\bigdataStudy\\java\\demo\\works\\work1");
             if(f3.exists()){
                 f3.mkdir();
             }else{
                 System.out.println("�̹� ����" + f3.getAbsolutePath());
             }
        }
}