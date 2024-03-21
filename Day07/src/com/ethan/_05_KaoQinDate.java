package com.ethan;

import javax.swing.*;

public class _05_KaoQinDate {
    public static void main(String[] args) {
//      日期控件对象(静态方法)
        DateChooser chooser1 = DateChooser.getInstance("yyyy/MM/dd");
        DateChooser chooser2 = DateChooser.getInstance("yyyy/MM/dd");

//      考勤面板
        JFrame jf = new JFrame("考勤日期查询");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

//      日期时间文本

        JLabel text1 = new JLabel("考勤日期");
        text1.setBounds(50, 20, 100, 20);
        jf.add(text1);

        JLabel text2 = new JLabel("开始时间");
        text2.setBounds(50, 70, 100, 20);
        jf.add(text2);

        JLabel text3 = new JLabel("结束时间");
        text3.setBounds(250, 70, 100, 20);
        jf.add(text3);

//      开始时间组件
        JTextField startField = new JTextField();
        startField.setBounds(50, 100, 100, 20);
        chooser1.register(startField); // 开始时间选择组件
        jf.add(startField);

//      结束时间组件
        JTextField textField2 = new JTextField();
        textField2.setBounds(250, 100, 100, 20);
        chooser2.register(textField2);  // 结束时间选择组件
        jf.add(textField2);

//      确定按钮组件
        JButton btn = new JButton("确定");
        btn.setBounds(255, 180, 60, 20);
        jf.add(btn);






        jf.setVisible(true);

    }
}
