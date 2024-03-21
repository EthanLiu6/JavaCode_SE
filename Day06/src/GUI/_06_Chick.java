package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class _06_Chick {
    public static void main(String[] args) {
        JFrame jf = new JFrame("点击事件");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        JButton btn = new JButton("点我啊");
        btn.setBounds(100, 70, 50, 20);
        jf.add(btn);
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点你个大头鬼");
            }
        });


        jf.setVisible(true);
    }
}
