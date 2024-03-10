package com.ethan;

import java.util.Scanner;

/*
    需求: 定义一个方法, 打印[1, n]之间的所有奇数
         n不合法则结束方法
 */
public class _02_SearchOddNum {
    public static void main(String[] args) {
        System.out.print("请输入终止数(从1开始,仅需填终止数即可)\nend_num = ");
        int end_num = new Scanner(System.in).nextInt();
        printOddNum(end_num);
    }

    private static void printOddNum(int end_num) {
        if (end_num < 1){
            System.out.println("ERROR: 输入数不合法!");
            return;
        }
        for (int i = 1; i <= end_num; i++){
            // 奇数判定
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
