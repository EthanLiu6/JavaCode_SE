package com.ethan;
/*
    自动包箱与拆箱
 */

public class _07_AutoBaoChai {
    public static void main(String[] args) {
        Integer in1 = 100; //自动包箱
        System.out.println(in1);
        int i = in1;  //自动拆箱
        System.out.println(i);
        in1 += 200;
        System.out.println(in1);

    }
}
