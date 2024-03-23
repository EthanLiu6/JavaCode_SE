package com.guiInherit;
/*
   Day06的用户登录GUI进行代码优化(继承)
 */

import javax.swing.*;

public class UserLoginFrame extends JFrame {
    public UserLoginFrame() {
        initFrame();
        paintView();
        this.setVisible(true);

    }

    public void initFrame() {
        this.setTitle("登录页面");
        this.setLocationRelativeTo(null);
        this.setSize(400, 300);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    //  登录信息: 账号,密码,登录按钮
    public void paintView() {
        JLabel countText = new JLabel("账号");
        countText.setBounds(50, 50, 50, 20);
        this.add(countText);

        JLabel passwordText = new JLabel("密码");
        passwordText.setBounds(50, 100, 50, 20);
        this.add(passwordText);

        JTextField countField = new JTextField();
        countField.setBounds(150, 50, 180, 20);
        this.add(countField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        this.add(passwordField);

        JButton btn = new JButton("登录");
        btn.setBounds(50, 200, 280, 20);
        this.add(btn);
    }
}
