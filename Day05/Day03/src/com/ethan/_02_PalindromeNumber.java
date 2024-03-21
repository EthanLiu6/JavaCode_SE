package com.ethan;

/*
    回文数
 */
public class _02_PalindromeNumber {
    // 输出所有五位数的回文数
    // 回文数：顺倒数一致 eg: 10101
    public static void main(String[] args) {
        int count = 0; // 计数器
        // 遍历五位数
        for (int i = 10000; i < 100000; i++) {
            // 数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            // 判断回文数
            if ((ge == wan) && (shi == qian)) {
                System.out.println("回文数：" + i);
                count++;
            }
        }
        System.out.println("回文数个数：" + count);
    }
}
