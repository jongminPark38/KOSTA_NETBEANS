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
public class Ex1 {
    //�䱸���� : 0~10���� ����ϴ� �����带 ������.
    public static void main(String[] args) throws InterruptedException{
        
    
      Ex1test em = new Ex1test();
      Ex1test em2 = new Ex1test();
      
      em.run();
      em.join();
      em2.run();
}
}
