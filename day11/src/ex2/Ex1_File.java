
package ex2;

import java.io.File;
import java.io.IOException;
import javafx.fxml.LoadException;

public class Ex1_File {
// 첫번째 경우
    public static void main(String[] args) {
        String path = "C:\\bigdataStudy\\java\\demo\\demo.txt";
        //파일 객체를 생성 : 해당 파일이나 경로가 없어도 추상적인 경로 가능
        File f = new File(path);
        // 주요 메서드 연습
        System.out.println("demo.txt가 존재하는가?" + f.exists());
        if(f.exists()){
            System.out.println("응");
            }
        System.out.println("demo.txt가 파일인가?" + f.isFile());
        System.out.println("실행이가 가능한가?" + f.canExecute());
        System.out.println("작성이 가능한가?" + f.canWrite());
        System.out.println("절대경로" + f.getAbsolutePath());
        System.out.println("");
        //두번? 경우
        // 경로 존재하지 않아도 오류 안남
        File f2 = new File("C:\\bigdataStudy\\java\\demo\\aa.txt");
        if (!f2.exists()){ //파일이 존재하지 않을?
            try {
                System.out.println("존재 aa를 만들겟");
                f2.createNewFile();
            }  catch (IOException ex) {
                ex.printStackTrace();
            }
            }else {
            System.out.println("이미 존재");
        }
         File f3 = new File("C:\\bigdataStudy\\java\\demo\\works\\work1");
             if(f3.exists()){
                 f3.mkdir();
             }else{
                 System.out.println("이미 존재" + f3.getAbsolutePath());
             }
        }
}