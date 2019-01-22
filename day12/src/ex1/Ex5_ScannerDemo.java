
package ex1;


import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javafx.scene.shape.Path;

public class Ex5_ScannerDemo {
    public static void main(String[] args)  throws MalformedURLException{
        String path = "https://sports.news.naver.com/kbaseball/news/read.nhn?oid=109&aid=0003935020";
        URL url = new URL(path);
        // impl
        try(Scanner sc = new Scanner(url.openStream(), "UTF-8")){
            String rdv = null;
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
