package com.ethan;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class _02_UserLoad {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("登录页面");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

//      登录信息: 账号,密码,登录按钮
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

        JButton loginBtn = new JButton("登录");
        loginBtn.setBounds(50, 200, 280, 20);
        jf.add(loginBtn);

//       账号密码
        String uname = "ethan";
        String upwd = "l20031220";

//       登录按钮事件
        loginBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取输入信息
                String username = countField.getText().trim();
                String password = passwordField.getText().trim();
                //判断用户输入
                if (username.length() > 12 || username.length() < 5) {
                    JOptionPane.showMessageDialog(jf, "您输入的账号有误,请输入5-12位字符");
                    countField.setText("");
                    return;
                }
                if (password.length() > 12 || password.length() < 5) {
                    JOptionPane.showMessageDialog(jf, "您输入的密码有误,请输入5-12位字符");
                    passwordField.setText("");
                    return;
                }

                // 判断账号状态
                if (username.equals(uname) && password.equals(upwd)) {
                    JOptionPane.showMessageDialog(jf, "登陆成功!😋");
                    countField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(jf, "账号密码有误");
                    countField.setText("");
                    passwordField.setText("");
                }

            }
        });

        jf.setVisible(true);
    }
}
