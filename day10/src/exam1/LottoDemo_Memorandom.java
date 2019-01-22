/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.TreeSet;

/**
 *
 * @author HannaRoh
 */

public class LottoDemo_Memorandom {
    private TreeSet<Integer> ts;
    public LottoDemo_Memorandom(){
        ts = new TreeSet<>();
        execute();
    }
    private void execute(){
        while(ts.size() != 6){
            int rnum = (int)(Math.random() * 45 + 1);
            ts.add(rnum);
        }
    }
}

