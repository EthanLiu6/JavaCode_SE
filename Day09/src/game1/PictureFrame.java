package game1;
/*
    新建模块,包
    定义类PictureFrame,继承JFrame
    在PictureFrame类中编写空参构造,构造中定义两个方法
        initFrame(); 窗体基本设置
        setVisible(true); 窗体可见
    在initFrame方法中编写窗体基本设置的代码
        设置大小
        设置标题
        窗体居中
        窗体关闭时停止程序(控制台)
        窗体置顶
        取消窗体默认布局
    创建测试类App,创建PictureFrame类对象进行测试
 */

import javax.swing.*;

//定义类PictureFrame,继承JFrame
public class PictureFrame extends JFrame {
    //    在PictureFrame类中编写空参构造,构造中定义两个方法
    public PictureFrame() {
        initFrame(); // 窗体基本设置
        this.setVisible(true); // 窗体可见
    }

    public void initFrame() {
        this.setSize(960, 565);
        this.setTitle("动漫拼图");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
