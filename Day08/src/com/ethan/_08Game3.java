package com.ethan;

import javax.swing.*;

/*
    动漫美女拼图: 图片展示
 */
public class _08Game3 {
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

        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel1 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + count + ".png"));
                jLabel1.setBounds(j * 90, i * 90, 90, 90);
                count ++;
                jf.add(jLabel1);
            }
        }

//
//        //第一行
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel1 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 1) + ".png"));
//            jLabel1.setBounds(i * 90, 0, 90, 90);
//            jf.add(jLabel1);
//        }
//        //第二行
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 5) + ".png"));
//            jLabel5.setBounds(i * 90, 90, 90, 90);
//            jf.add(jLabel5);
//        }
//
//        //第三行
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 9) + ".png"));
//            jLabel5.setBounds(i * 90, 180, 90, 90);
//            jf.add(jLabel5);
//        }
//        //第四行
//        for (int i = 0; i < 4; i++) {
//            JLabel jLabel5 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + (i + 13) + ".png"));
//            jLabel5.setBounds(i * 90, 270, 90, 90);
//            jf.add(jLabel5);
//        }

        //窗体显示
        jf.setVisible(true);

    }
}
