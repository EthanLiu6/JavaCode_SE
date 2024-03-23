package com.ethan;

import javax.swing.*;
import java.util.Random;

/*
    动漫美女拼图: 打乱图片
 */
public class _09Game4 {
    public static void main(String[] args) {
        //窗体设置
        JFrame jf = myFrame();

        //随机数对象
        Random rdm = new Random();

        //图片计数器
        int[][] count = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        //随机打乱图片
        randomImgs(rdm, count);

        //打乱后图片展示
        viewShow(jf, count);

        //窗体显示
        jf.setVisible(true);

    }

    private static JFrame myFrame() {
        //窗体对象
        JFrame jf = new JFrame();
        //相关设置
        jf.setTitle("动漫美女拼图: 图片展示");
        jf.setSize(360, 380);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        return jf;
    }

    private static void randomImgs(Random rdm, int[][] count) {
        //随机打乱图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int rdmXidx = rdm.nextInt(4);
                int rdmYidx = rdm.nextInt(4);
                int temp = count[i][j];
                count[i][j] = count[rdmYidx][rdmXidx];
                count[rdmYidx][rdmXidx] = temp;
            }
        }
    }

    private static void viewShow(JFrame jf, int[][] count) {
        //      打乱后图片展示
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel1 = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/java_workspace/JavaCode_SE/Day08/images/" + count[i][j] + ".png"));
                jLabel1.setBounds(j * 90, i * 90, 90, 90);
                jf.add(jLabel1);
            }
        }
    }
}
