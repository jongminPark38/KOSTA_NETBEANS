/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HannaRoh
 */
public class HolJJackGame_1 extends javax.swing.JFrame {

    private CardLayout card;
    private int count = 0;
    private int win = 0;
    private double winRate = 0;

    public HolJJackGame_1() {
        initComponents();
        card = (CardLayout) jPanel1.getLayout();

//        int win = 10;
//        int total = 17;
//        double winRate = Math.round((double) win / total * 100) / 100.0;
//        winRateText.setText("당신의 승률은" + winRate + "%입니다.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namev = new javax.swing.JTextField();
        moneyv = new javax.swing.JTextField();
        startGameBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        winRateText = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        oddNum = new javax.swing.JButton();
        evenNum = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        totalGame = new javax.swing.JLabel();
        winGame = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        winRateResult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        win70 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        p1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ex3/img3.PNG"))); // NOI18N

        jLabel4.setText("이름:");

        jLabel5.setText("돈:");

        namev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namevActionPerformed(evt);
            }
        });

        moneyv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyvActionPerformed(evt);
            }
        });

        startGameBtn.setText("입력");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("WinRate");

        winRateText.setText("jLabel11");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namev)
                            .addComponent(moneyv, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(startGameBtn)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(winRateText))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(moneyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(winRateText))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.add(p1, "card2");

        p2.setBackground(new java.awt.Color(255, 153, 102));

        oddNum.setText("홀");
        oddNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddNumActionPerformed(evt);
            }
        });

        evenNum.setText("짝");
        evenNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evenNumActionPerformed(evt);
            }
        });

        exitBtn.setText("종료");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        totalGame.setText("Total : 1");

        winGame.setText("Win : 1");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oddNum)
                    .addComponent(totalGame)
                    .addComponent(winGame, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(36, 36, 36)
                .addComponent(evenNum)
                .addGap(52, 52, 52)
                .addComponent(exitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(winGame)
                        .addGap(53, 53, 53)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oddNum)
                                    .addComponent(evenNum))
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addComponent(exitBtn)
                                .addGap(214, 214, 214))))))
        );

        jPanel1.add(p2, "card4");

        p3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ex3/img5.PNG"))); // NOI18N

        jButton1.setText("ReGame");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(win70))
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(winRateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(winRateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(win70)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.add(p3, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moneyvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyvActionPerformed
//
    }//GEN-LAST:event_moneyvActionPerformed

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed

        String name;
        int money;

        if (namev.getText().equals("") || moneyv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "빈칸을 입력하세요!");
            card.show(jPanel1, "card4");
            moneyv.setText("");
            namev.setText("");

        } else {

            try {
                name = new String(namev.getText());
                System.out.println(name);
            } catch (StringIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "문자만 입력하세요!");
                moneyv.setText("");
                namev.setText("");
            }
            try {
                money = Integer.parseInt(moneyv.getText());
                System.out.println(money);
                 card.show(jPanel1, "card4");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "정수만 입력하세요!");
                moneyv.setText("");
                namev.setText("");
            }
                           
        }
    

//              
//                  
//
//                } catch (StringIndexOutOfBoundsException e) {
//                    JOptionPane.showMessageDialog(this, "문자만 입력하세요!");
//                    moneyv.setText("");
//                    namev.setText("");
//
//                } catch (NumberFormatException e) {
//                    JOptionPane.showMessageDialog(this, "정수만 입력하세요!");
//                    moneyv.setText("");
//                    namev.setText("");
//                }
//
//                if (moneyv.getText().equals("")) {
//                    JOptionPane.showMessageDialog(this, "금액을 입력하세요!");
//                    moneyv.setText("");
//                    namev.setText("");
//                } else {
//                    try {
//                        money = Integer.parseInt(moneyv.getText());
//                        System.out.println(money);
//                        card.show(jPanel1, "card4");
//                    } catch (NumberFormatException e) {
//                        JOptionPane.showMessageDialog(this, "정수만 입력하세요!");
//                        moneyv.setText("");
//                        namev.setText("");
//
//                    }

    }//GEN-LAST:event_startGameBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        count = 0;
        win = 0;
        moneyv.setText("");
        namev.setText("");
        card.show(jPanel1, "card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void namevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namevActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        double winRate = Math.round((double) win / count * 100 * 100) / 100.0;
        JOptionPane.showMessageDialog(this, "게임이 종료됩니다.\n 당신의 승률은" + winRate + "%입니다.");
        winRateResult.setText("당신의 승률은" + winRate + "%입니다.");
        if (winRate >= 70) {
            win70.setText("축하합니다!!! 샤넬 향수에 당첨 되셨습니다!!!");
        } else {
            win70.setText("아쉽습니다... 다시 한번 도전!!!! ");
        }
        card.show(jPanel1, "card5");
    }//GEN-LAST:event_exitBtnActionPerformed

    private void oddNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddNumActionPerformed
        count++;
        int comnum = (int) (Math.random() * 2) + 1;
        if (comnum == 1) {
            JOptionPane.showMessageDialog(this, "이겼습니다!" + count + "번째 게임입니다.!");
            win++;
        } else if (comnum == 2) {
            JOptionPane.showMessageDialog(this, "졌습니다!" + count + "번째 게임입니다.!");
        }


    }//GEN-LAST:event_oddNumActionPerformed

    private void evenNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evenNumActionPerformed
        count++;
        int comnum = (int) (Math.random() * 2) + 1;
        if (comnum == 2) {
            JOptionPane.showMessageDialog(this, "이겼습니다!" + count + "번째 게임입니다.!");
            win++;
        } else if (comnum == 1) {
            JOptionPane.showMessageDialog(this, "졌습니다!" + count + "번째 게임입니다.!");
        }
    }//GEN-LAST:event_evenNumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                



}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HolJJackGame.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HolJJackGame.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HolJJackGame.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HolJJackGame.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HolJJackGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evenNum;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moneyv;
    private javax.swing.JTextField namev;
    private javax.swing.JButton oddNum;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JButton startGameBtn;
    private javax.swing.JLabel totalGame;
    private javax.swing.JLabel win70;
    private javax.swing.JLabel winGame;
    private javax.swing.JLabel winRateResult;
    private javax.swing.JLabel winRateText;
    // End of variables declaration//GEN-END:variables

    private String String(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
