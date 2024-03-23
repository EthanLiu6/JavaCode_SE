package com.ethan;

import javax.swing.*;

/*
    动漫美女拼图: 图片展示
 */
public class _06Game1 {
    public static void main(String[] args) {
        //窗体对象
        JFrame jf = new JFrame();
        //相关设置
        jf.setTitle("动漫美女拼图: 图片展示");
        jf.setSize(360, 380);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //第一行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel1 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 1) + ".png"));
            jLabel1.setBounds(i * 90, 0, 90, 90);
            jf.add(jLabel1);
        }

//        JLabel jLabel2 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/2.png"));
//        jLabel2.setBounds(90, 0, 90, 90);
//        jf.add(jLabel2);
//
//        JLabel jLabel3 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/3.png"));
//        jLabel3.setBounds(180, 0, 90, 90);
//        jf.add(jLabel3);
//
//        JLabel jLabel4 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/4.png"));
//        jLabel4.setBounds(270, 0, 90, 90);
//        jf.add(jLabel4);

        //第二行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 5) + ".png"));
            jLabel5.setBounds(i * 90, 90, 90, 90);
            jf.add(jLabel5);
        }
//
//        JLabel jLabel6 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/6.png"));
//        jLabel6.setBounds(90, 90, 90, 90);
//        jf.add(jLabel6);
//
//        JLabel jLabel7 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/7.png"));
//        jLabel7.setBounds(180, 90, 90, 90);
//        jf.add(jLabel7);
//
//        JLabel jLabel8 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/8.png"));
//        jLabel8.setBounds(270, 90, 90, 90);
//        jf.add(jLabel8);

        //第三行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 9) + ".png"));
            jLabel5.setBounds(i * 90, 180, 90, 90);
            jf.add(jLabel5);
        }
//
//        JLabel jLabel10 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/10.png"));
//        jLabel10.setBounds(90, 180, 90, 90);
//        jf.add(jLabel10);
//
//        JLabel jLabel11 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/11.png"));
//        jLabel11.setBounds(180, 180, 90, 90);
//        jf.add(jLabel11);
//
//        JLabel jLabel12 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/12.png"));
//        jLabel12.setBounds(270, 180, 90, 90);
//        jf.add(jLabel12);

        //第四行
        for (int i = 0; i < 4; i++) {
            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 13) + ".png"));
            jLabel5.setBounds(i * 90, 270, 90, 90);
            jf.add(jLabel5);
        }

//
//        JLabel jLabel14 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/14.png"));
//        jLabel14.setBounds(90, 270, 90, 90);
//        jf.add(jLabel14);
//
//        JLabel jLabel15 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/15.png"));
//        jLabel15.setBounds(180, 270, 90, 90);
//        jf.add(jLabel15);
//
//        JLabel jLabel16 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/16.png"));
//        jLabel16.setBounds(270, 270, 90, 90);
//        jf.add(jLabel16);

        //窗体显示
        jf.setVisible(true);

    }
}
