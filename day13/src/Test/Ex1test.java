/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author KOSTA
 */
public class Ex1test implements Runnable{

    @Override
    public void run() {
        //�����忡�� �ؾ��� �۾��� run���� ���
        System.out.println("^-------^" );
          for(int i = 0; i <= 10; i++){
            System.out.println(i + " \t");
    
    }

  

    }

    void join() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
