package GUI;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Join_GUI extends javax.swing.JFrame {
   
    boolean check = false;
    String id;

    public Join_GUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        joinname = new javax.swing.JTextField();
        joinid = new javax.swing.JTextField();
        joincell1 = new javax.swing.JTextField();
        joinCheckBtn = new javax.swing.JButton();
        joinBtn = new javax.swing.JButton();
        joinBackBtn = new javax.swing.JButton();
        joinpw = new javax.swing.JPasswordField();
        joincell2 = new javax.swing.JTextField();
        joincell3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("PW");

        jLabel5.setText("CellPhone");

        joinname.setText("�̸��� �Է��ϼ���");
        joinname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinnameMouseClicked(evt);
            }
        });
        joinname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinnameActionPerformed(evt);
            }
        });

        joinid.setText("���̵� �Է��ϼ���");
        joinid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                joinidMouseClicked(evt);
            }
        });
        joinid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinidActionPerformed(evt);
            }
        });

        joincell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joincell1ActionPerformed(evt);
            }
        });

        joinCheckBtn.setText("�ߺ�üũ");
        joinCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinCheckBtnActionPerformed(evt);
            }
        });

        joinBtn.setText("ȸ������");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });

        joinBackBtn.setText("�ڷ�");
        joinBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBackBtnActionPerformed(evt);
            }
        });

        joinpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinpwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(joinpw, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 89, Short.MAX_VALUE)
                            .addComponent(joinBackBtn)
                            .addGap(38, 38, 38)
                            .addComponent(joinBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(joinname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(joinid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(joinCheckBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(joincell1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(joincell2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(joincell3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(joinname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(joinid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinCheckBtn))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(joinpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(joincell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joincell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joincell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinBtn)
                    .addComponent(joinBackBtn))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBackBtnActionPerformed
// �ڷ�
// �α��� �������� �̵�


    }//GEN-LAST:event_joinBackBtnActionPerformed

    private void joinCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinCheckBtnActionPerformed
if (joinid.getText().equals("")) { // idv�� ��ĭ�� ���¿��� �ߺ�üũ��ư�� ������ ��
            JOptionPane.showMessageDialog(this, "���̵��Է�");
}else{
        id = joinid.getText(); // joinid �� �Էµ� ���� id�� ����
        sendMsg("id_check/" + id + "/");
}
    }//GEN-LAST:event_joinCheckBtnActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
//ȸ������

        String namev = joinname.getText(); //�Է��� ���� namev�� ����
        String idv = joinid.getText(); // �Է��� ���� idv�� ����
        String passwordv = joinpw.getText(); //�Է��� ���� passwordv�� ���� 
        String cellphonev1 = joincell1.getText(); // �Է��� ���� cell1�� ����
        String cellphonev2 = joincell2.getText(); // �Է��� ���� cell2�� ����
        String cellphonev3 = joincell3.getText(); // �Է��� ���� cell3�� ����

        if (namev.equals("")) { //namev�� ��ĭ�� ���
            JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���"); // �����޽���
        } else if (idv.equals("")) { // idv�� ��ĭ�� ���
            JOptionPane.showMessageDialog(this, "�ƾƵ� �Է��ϼ���");
        } else if (passwordv.equals("")) { // passwordv�� ��ĭ�� ���
            JOptionPane.showMessageDialog(this, "��й�ȣ�� �Է��ϼ���");
        } else if (cellphonev1.equals("") || cellphonev2.equals("") || cellphonev3.equals("")) {
            // cell1,2,3�� ��ĭ�� ���
            JOptionPane.showMessageDialog(this, "�ڵ��� ��ȣ�� �Է��ϼ���");
        } else if (!(cellphonev1.matches("[0-9]{3}") && cellphonev2.matches("[0-9]{4}") && cellphonev3.matches("[0-9]{4}"))) {
            // cell1,2,3�� ���ڰ� �ƴϰ�, ���� 3,4,4 ���ڰ� �ƴ� ���
            JOptionPane.showMessageDialog(this, "�ڵ��� ��ȣ�� �ٽ� �Է��ϼ���");
        } else if (check == false) { // �ߺ�üũ�� ������ ���
            JOptionPane.showMessageDialog(this, "�ߺ� üũ �ϼ���");
        }else if(!(idv.equals(id))) { // �Էµ� idv�� ����joinid�� ���� ���� ��� 
            JOptionPane.showMessageDialog(this, "�ߺ�üũ�� �ٽ� �ϼ���");
        }else {
            JOptionPane.showMessageDialog(this, "ȸ�����Կ� ���� �Ǿ����ϴ�.");
         
            
            
            JSONParser parser = new JSONParser();       // �ҷ�����
            JSONObject memberInfo = new JSONObject();   // ���� ���� ��ü ����

            try {
                JSONObject members = (JSONObject) parser.parse(new FileReader(
                        "C:\\bigdataStudy\\java\\netwokrspace\\KOSTA_NETBEANS\\Semi_Project\\src\\GUI\\JsonGrace.json"));
                // Ű�� ���� ��ü ���� --> �ҷ�����

                memberInfo.put("Name", namev);        //�Է��� ���� JSon�� ����
                memberInfo.put("ID", idv);            //�Է��� ���� JSon�� ����
                memberInfo.put("password", passwordv);//�Է��� ���� JSon�� ����
                memberInfo.put("Cell1", cellphonev1); //�Է��� ���� JSon�� ����
                memberInfo.put("Cell2", cellphonev2); //�Է��� ���� JSon�� ����
                memberInfo.put("Cell3", cellphonev3); //�Է��� ���� JSon�� ����
                       
               members.put( namev, memberInfo);
                                                
                FileWriter fw = new FileWriter("C:\\bigdataStudy\\java\\netwokrspace\\KOSTA_NETBEANS\\Semi_Project\\src\\GUI\\JsonGrace.json");
                fw.write(members.toJSONString());
                fw.flush();
                fw.close();

            } catch (FileNotFoundException ex) {
            } catch (IOException e) {
            } catch (ParseException e) {
            }

            System.out.println("memberInfo");
            
            
                    
            check = false;      //�ߺ�üũ ���� false��
            joinname.setText("");
            joinid.setText("");
            joinpw.setText("");
            joincell1.setText("");
            joincell2.setText("");
            joincell3.setText("");
        }
    }//GEN-LAST:event_joinBtnActionPerformed

    private void joinpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinpwActionPerformed

    private void joinnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinnameActionPerformed


    }//GEN-LAST:event_joinnameActionPerformed

    private void joincell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joincell1ActionPerformed


    }//GEN-LAST:event_joincell1ActionPerformed

    private void joinidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinidActionPerformed

    private void joinnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinnameMouseClicked
        joinname.setText("");
    }//GEN-LAST:event_joinnameMouseClicked

    private void joinidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinidMouseClicked
        joinid.setText("");
    }//GEN-LAST:event_joinidMouseClicked

    public void sendMsg(String msg) {
        Socket socket = null; //  socket����
        PrintWriter pw = null; // server�� ������ ���� ��� ��Ʈ��
        BufferedReader br = null; // server�κ��� �����͸� �о���̱� ���� �Է½�Ʈ��
        try {
            socket = new Socket("localhost", 9999); 
            //server�� ����
            pw = new PrintWriter(socket.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(msg);
            pw.println(msg);

            String answer = br.readLine();

            StringTokenizer stz = new StringTokenizer(answer, "/");
            String token = stz.nextToken();

            if (token.equals("id_check")) {
                if (stz.nextToken().equals("true")) {
                    JOptionPane.showMessageDialog(this, "��밡���� ���̵��Դϴ�.");
               check = true;
                }
                else {
                    JOptionPane.showMessageDialog(this, "�̹� �����ϴ� ���̵��Դϴ�.");
                check = false;
                } 
            }
            try {
                if (!socket.isClosed()) {
                    br.close();
                    pw.close();
                    socket.close();
                }
            } catch (IOException ex) {
            }
        } catch (IOException ex) {
        }
//        finally {
//            try {
//                if (!socket.isClosed()) {
//                    br.close();
//                    pw.close();
//                    socket.close();
//                }
//            } catch (IOException ex) {
//            }
//        }
    }

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
            java.util.logging.Logger.getLogger(Join_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Join_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Join_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Join_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Join_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinBackBtn;
    private javax.swing.JButton joinBtn;
    private javax.swing.JButton joinCheckBtn;
    private javax.swing.JTextField joincell1;
    private javax.swing.JTextField joincell2;
    private javax.swing.JTextField joincell3;
    private javax.swing.JTextField joinid;
    private javax.swing.JTextField joinname;
    private javax.swing.JPasswordField joinpw;
    // End of variables declaration//GEN-END:variables
}
