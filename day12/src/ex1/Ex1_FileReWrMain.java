package ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_FileReWrMain {
    private Ex1_FileReWrDemo efr;
    
    public Ex1_FileReWrMain() {
        efr = new Ex1_FileReWrDemo();
    }
    public void execWriter(String memo){
        efr.writeMemo(memo);
    }
    public void execReader(){
        try {
            ArrayList<String> arilst = efr.getMemo();
            for(String e : arilst){
            System.out.println(e);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Ex1_FileReWrMain mains = new Ex1_FileReWrMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("memo : ");
        mains.execWriter(sc.nextLine());
        mains.execReader();
    }
}