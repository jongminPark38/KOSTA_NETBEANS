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
public class SetTest_LottoService implements SetTest_LottoInter{

    @Override
    public String getLottoNum() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts = new TreeSet<>();
        while(ts.size() != 6){
            int rnum = (int)(Math.random() * 45 + 1);
            ts.add(rnum);
            
        }
        StringBuffer sb = new StringBuffer();
        for(Integer e : ts ){
        sb.append(String.valueOf(e)+"\t");    
        }            
        return sb.toString();
        
    }

    @Override
    public void setLottoGameNum(int num) {
        for(int i=1; i<num+1; i++){
             System.out.println("No.    "+i+"="+ getLottoNum()); 
            }
          }
    }


