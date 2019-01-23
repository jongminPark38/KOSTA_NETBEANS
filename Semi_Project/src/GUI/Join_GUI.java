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

        joinname.setText("이름을 입력하세요");
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

        joinid.setText("아이디를 입력하세요");
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

        joinCheckBtn.setText("중복체크");
        joinCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinCheckBtnActionPerformed(evt);
            }
        });

        joinBtn.setText("회원가입");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });

        joinBackBtn.setText("뒤로");
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
// 뒤로
// 로그인 페이지로 이동


    }//GEN-LAST:event_joinBackBtnActionPerformed

    private void joinCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinCheckBtnActionPerformed
if (joinid.getText().equals("")) { // idv가 빈칸인 상태에서 중복체크버튼을 눌렀을 때
            JOptionPane.showMessageDialog(this, "아이디입력");
}else{
        id = joinid.getText(); // joinid 에 입력된 값을 id에 저장
        sendMsg("id_check/" + id + "/");
}
    }//GEN-LAST:event_joinCheckBtnActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
//회원가입

        String namev = joinname.getText(); //입력한 값을 namev에 대입
        String idv = joinid.getText(); // 입력한 값을 idv에 대입
        String passwordv = joinpw.getText(); //입력한 값을 passwordv에 대입 
        String cellphonev1 = joincell1.getText(); // 입력한 값을 cell1에 대입
        String cellphonev2 = joincell2.getText(); // 입력한 값을 cell2에 대입
        String cellphonev3 = joincell3.getText(); // 입력한 값을 cell3에 대입

        if (namev.equals("")) { //namev가 빈칸일 경우
            JOptionPane.showMessageDialog(this, "이름을 입력하세요"); // 에러메시지
        } else if (idv.equals("")) { // idv가 빈칸일 경우
            JOptionPane.showMessageDialog(this, "아아디를 입력하세요");
        } else if (passwordv.equals("")) { // passwordv가 빈칸일 경우
            JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
        } else if (cellphonev1.equals("") || cellphonev2.equals("") || cellphonev3.equals("")) {
            // cell1,2,3이 빈칸일 경우
            JOptionPane.showMessageDialog(this, "핸드폰 번호를 입력하세요");
        } else if (!(cellphonev1.matches("[0-9]{3}") && cellphonev2.matches("[0-9]{4}") && cellphonev3.matches("[0-9]{4}"))) {
            // cell1,2,3이 숫자가 아니고, 각각 3,4,4 글자가 아닐 경우
            JOptionPane.showMessageDialog(this, "핸드폰 번호를 다시 입력하세요");
        } else if (check == false) { // 중복체크를 안했을 경우
            JOptionPane.showMessageDialog(this, "중복 체크 하세요");
        }else if(!(idv.equals(id))) { // 입력된 idv와 현재joinid가 같지 않을 경우 
            JOptionPane.showMessageDialog(this, "중복체크를 다시 하세요");
        }else {
            JOptionPane.showMessageDialog(this, "회원가입에 성공 되었습니다.");
         
            
            
            JSONParser parser = new JSONParser();       // 불러오기
            JSONObject memberInfo = new JSONObject();   // 값에 대한 객체 생성

            try {
                JSONObject members = (JSONObject) parser.parse(new FileReader(
                        "C:\\bigdataStudy\\java\\netwokrspace\\KOSTA_NETBEANS\\Semi_Project\\src\\GUI\\JsonGrace.json"));
                // 키에 대한 객체 생성 --> 불러오기

                memberInfo.put("Name", namev);        //입력한 값을 JSon에 저장
                memberInfo.put("ID", idv);            //입력한 값을 JSon에 저장
                memberInfo.put("password", passwordv);//입력한 값을 JSon에 저장
                memberInfo.put("Cell1", cellphonev1); //입력한 값을 JSon에 저장
                memberInfo.put("Cell2", cellphonev2); //입력한 값을 JSon에 저장
                memberInfo.put("Cell3", cellphonev3); //입력한 값을 JSon에 저장
                       
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
            
            
                    
            check = false;      //중복체크 값을 false로
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
        Socket socket = null; //  socket생성
        PrintWriter pw = null; // server로 보내기 위한 출력 스트림
        BufferedReader br = null; // server로부터 데이터를 읽어들이기 위한 입력스트림
        try {
            socket = new Socket("localhost", 9999); 
            //server로 접속
            pw = new PrintWriter(socket.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(msg);
            pw.println(msg);

            String answer = br.readLine();

            StringTokenizer stz = new StringTokenizer(answer, "/");
            String token = stz.nextToken();

            if (token.equals("id_check")) {
                if (stz.nextToken().equals("true")) {
                    JOptionPane.showMessageDialog(this, "사용가능한 아이디입니다.");
               check = true;
                }
                else {
                    JOptionPane.showMessageDialog(this, "이미 존재하는 아이디입니다.");
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
