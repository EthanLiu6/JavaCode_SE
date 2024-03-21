package GUI;

import javax.swing.*;

public class _04_RandomNum {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("猜数字");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        JLabel text = new JLabel("系统产生了一个1-100的随机数,请猜一猜");
        text.setBounds(70, 50, 350, 20);
        jf.add(text);

        JTextField textField = new JTextField();
        textField.setBounds(120, 100, 150, 20);
        jf.add(textField);

        JButton btn = new JButton("我猜");
        btn.setBounds(145, 150, 100, 20);
        jf.add(btn);

        jf.setVisible(true);
    }
}
