/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.Scanner;

public class SetTest_LottoMain {
       

    public static void main(String[] args) {
        SetTest_LottoService ls = new SetTest_LottoService();
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int num = i/1000;
        ls.setLottoGameNum(num);
            
    }
}
