package ex1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA
 */
public class InnerClassDemo extends JFrame {

    private JPanel p1, p2;
    private JButton b1, b2, b3;

    public InnerClassDemo() {
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("Red");
        b2 = new JButton("Green");
        b3 = new JButton("Blue");

        p1.setBackground(Color.white);
        
        b1.setBackground(Color.RED);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        add(p1);
        add(p2, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 450);
        setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(b1.getBackground());
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(b2.getBackground());
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(b3.getBackground());
            }
        });
    }

    public static void main(String[] args) {
        new InnerClassDemo();
    }


//    public void actionPerformed(ActionEvent e) {
//        p1.setBackground(b1.getBackground());
//        
//        JButton btn = (JButton) e.getSource();
//        if (btn == b1) {
//            System.out.println("red 버튼 클릭!");
//        }else if (btn == b2) {
//            System.out.println("green 버튼 클릭!");
//        }else if (btn == b3) {
//            System.out.println("blue 버튼 클릭!");
//        }
//        p1.setBackground(btn.getBackground());
//    }

}
