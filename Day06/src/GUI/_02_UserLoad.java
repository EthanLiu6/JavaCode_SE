package GUI;

import javax.swing.*;
import java.awt.*;

public class _02_UserLoad {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("登录页面");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

//       登录信息: 账号,密码,登录按钮
        JLabel countText = new JLabel("账号");
        countText.setBounds(50, 50, 50, 20);
        jf.add(countText);

        JLabel passwordText = new JLabel("密码");
        passwordText.setBounds(50, 100, 50, 20);
        jf.add(passwordText);

        JTextField countField = new JTextField();
        countField.setBounds(150, 50, 180, 20);
        jf.add(countField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);

        JButton btn = new JButton("登录");
        btn.setBounds(50, 200, 280, 20);
        jf.add(btn);

        jf.setVisible(true);
    }
}
