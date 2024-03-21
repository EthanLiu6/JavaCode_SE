package com.ethan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class _04_RandomNum {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("猜数字");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        //生成随机数
        int rdmNum = new Random().nextInt(100) + 1;

        JLabel text = new JLabel("系统产生了一个1-100的随机数,请猜一猜");
        text.setBounds(70, 50, 350, 20);
        jf.add(text);

        JTextField numField = new JTextField();
        numField.setBounds(120, 100, 150, 20);
        jf.add(numField);

        JButton btn = new JButton("我猜");
        btn.setBounds(145, 150, 100, 20);
        jf.add(btn);

        //点击猜测事件
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sGuessNum = numField.getText().trim();
                if (sGuessNum.equals("")) {
                    JOptionPane.showMessageDialog(jf, "输入数字为空");
                    return;
                }
                int guessNum = Integer.parseInt(sGuessNum);
                if (guessNum > 100 || guessNum < 1) {
                    JOptionPane.showMessageDialog(jf, "请输入1-100的整数");
                    numField.setText("");
                } else if (guessNum == rdmNum) {
                    JOptionPane.showMessageDialog(jf, "恭喜你,猜对了");
                    return;
                } else if (guessNum > rdmNum) {
                    JOptionPane.showMessageDialog(jf, "你猜的 " + guessNum + " 猜大了");
                    numField.setText("");
                } else {
                    JOptionPane.showMessageDialog(jf, "你猜的 " + guessNum + " 猜小了");
                    numField.setText("");
                }
            }
        });

        jf.setVisible(true);
    }
}
