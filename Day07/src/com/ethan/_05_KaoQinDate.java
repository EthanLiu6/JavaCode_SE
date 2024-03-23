package com.ethan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _05_KaoQinDate {
    public static void main(String[] args) {
//      日期控件对象(静态方法)
        DateChooser chooserStart = DateChooser.getInstance("yyyy-MM-dd");
        DateChooser chooserEnd = DateChooser.getInstance("yyyy-MM-dd");

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
        chooserStart.register(startField); // 开始时间选择组件
        jf.add(startField);

//      结束时间组件
        JTextField endField = new JTextField();
        endField.setBounds(250, 100, 100, 20);
        chooserEnd.register(endField);  // 结束时间选择组件
        jf.add(endField);

//      确定按钮组件
        JButton btn = new JButton("确定");
        btn.setBounds(255, 180, 60, 20);
        jf.add(btn);


//      添加按钮事件
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取str日期
                String strStart = startField.getText();
                String strEnd = endField.getText();

                // 格式化日期对象
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                // 解析为Date格式
                try {
                    Date startDate = sdf.parse(strStart);
                    Date endDate = sdf.parse(strEnd);

                    // 弹窗展示
                    JOptionPane.showMessageDialog(jf, startDate + "\n" + endDate);

                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
            }
        });


        jf.setVisible(true);

    }
}
