package com.ethan;
/*
    时间日期GUI综合案例
 */

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _10_ShowDateTime {
    public static void main(String[] args) {
        JFrame jf = new JFrame("时间日期获取");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        提示日期
        JLabel dateLabel = new JLabel("日期");
        dateLabel.setBounds(50, 50, 100, 20);
        jf.add(dateLabel);

//        提示时间
        JLabel timeLable = new JLabel("时间");
        timeLable.setBounds(50, 150, 100, 20);
        jf.add(timeLable);

//        日期字符串
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy年MM月dd日");
        String strDate = sdfDate.format(new Date());
        JLabel showDate = new JLabel(strDate);
        showDate.setBounds(50, 80, 200, 20);
        jf.add(showDate);

//        时间字符串
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH点mm分ss秒");
        String strTime = sdfTime.format(new Date());
        JLabel showTime = new JLabel(strTime);
        showTime.setBounds(50, 180, 200, 20);
        jf.add(showTime);

        jf.setVisible(true);
    }
}
