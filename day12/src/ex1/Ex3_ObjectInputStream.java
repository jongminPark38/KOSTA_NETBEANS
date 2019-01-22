package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex3_ObjectInputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = null;

        try {
            String path = "C:\\bigdatastudy\\java\\demo\\memo.txt";
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path)));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}