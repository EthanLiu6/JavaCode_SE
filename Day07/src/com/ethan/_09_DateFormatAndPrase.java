package com.ethan;
/*
    时间日期格式化与解释
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _09_DateFormatAndPrase {
    public static void main(String[] args) throws ParseException {
//        date -> string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(new Date()));

//        string -> date
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse("2024年3月22日 23:59:30");
        System.out.println(date);
        System.out.println(sdf.format(date));

    }
}
