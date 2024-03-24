package game3;
/*
    绘制基本组件1
 */

import javax.swing.*;
import java.util.Random;

//定义类PictureFrame,继承JFrame
public class PictureFrame extends JFrame {
    // 存储图片编号
    private int[][] imgIdx = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0} //16要换成0(空白图)
    };

    //    在PictureFrame类中编写空参构造,构造中定义两个方法
    public PictureFrame() {
        initFrame(); // 窗体基本设置
        randomImg(); // 图片打乱
        this.setVisible(true); // 窗体可见
        paintView(); // 绘制基本组件
    }

    public void initFrame() {
        this.setSize(960, 565);
        this.setTitle("动漫拼图");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }

    public void paintView() {
        // 1.标题图片
        JLabel titleLable = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/title.png"));
        titleLable.setBounds(254, 27, 232, 57);
        this.add(titleLable);

        // 2.主界面

        // 创建面板(用JPanel)
        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        imagePanel.setLayout(null); //也是容器组件
        // 遍历图片编号,展示图片
        for (int i = 0; i < imgIdx.length; i++) {
            for (int j = 0; j < imgIdx[i].length; j++) {
                JLabel imageLable = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/" + imgIdx[i][j] + ".png"));
                imageLable.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLable);
            }
        }
        this.add(imagePanel);

        // 参照图
        JLabel canzhaoLabel = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/canzhaotu.png"));
        canzhaoLabel.setBounds(574, 114, 122, 121);
        this.add(canzhaoLabel);

        // 上下左右, 求助, 重置按钮
        JButton upButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/shang.png"));
        JButton downButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/xia.png"));
        JButton leftButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/zuo.png"));
        JButton rightButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/you.png"));
        JButton helpButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/qiuzhu.png"));
        JButton resetButton = new JButton(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/chongzhi.png"));

        upButton.setBounds(732, 265, 57, 57);
        downButton.setBounds(732, 347, 57, 57);
        leftButton.setBounds(650, 347, 57, 57);
        rightButton.setBounds(813, 347, 57, 57);
        helpButton.setBounds(626, 444, 108, 45);
        resetButton.setBounds(786, 444, 108, 45);

        this.add(upButton);
        this.add(downButton);
        this.add(leftButton);
        this.add(rightButton);
        this.add(helpButton);
        this.add(resetButton);

        // 背景图
        JLabel backgroungLabel = new JLabel(new ImageIcon("/Users/ethan.liu/Desktop/06_java_workspace/JavaCode_SE/Day09/imgs/background.png"));
        backgroungLabel.setBounds(0, 0, 960, 530);
        this.add(backgroungLabel);
    }

    public void randomImg() {
        //打乱数组
        Random rdm = new Random();
        for (int i = 0; i < imgIdx.length; i++) {
            for (int j = 0; j < imgIdx[i].length; j++) {
                int rdm1Idx = rdm.nextInt(imgIdx.length);
                int rdm2Idx = rdm.nextInt(imgIdx[rdm1Idx].length);
                int temp = imgIdx[i][j];
                imgIdx[i][j] = imgIdx[rdm1Idx][rdm2Idx];
                imgIdx[rdm1Idx][rdm2Idx] = temp;
            }
        }
    }
}
