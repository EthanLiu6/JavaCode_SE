package com.ethan;
/*
    从时间原点开始,经历两天
 */

import java.util.Date;

public class _08_DateTime {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        //要求:从时间原点开始,经历两天时间的时刻
        Date d2 = new Date(1000 * 60 * 60 *24 *2);
        System.out.println(d2); // Sat Jan 03 08:00:00 CST 1970 东八区的时差会默认识别
    }
}
