package GUI;

import javax.swing.*;

public class _01_demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("我的第一个GUI界面哦~");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JButton btn1 = new JButton("登录");
        JButton btn2 = new JButton("取消");
//        btn.setSize(50,20);
//        btn.setLocation(100,20);
        btn1.setBounds(100, 200, 80, 30);
        btn2.setBounds(190, 200, 80, 30);
        jf.add(btn1);
        jf.add(btn2);

        ImageIcon loc = new ImageIcon("GUI/个人照.jpg");
        JLabel img = new JLabel(loc);
        img.setBounds(50, 50, 81, 66);
        img.setVisible(true);
        jf.add(img);
        jf.setVisible(true);


    }
}
