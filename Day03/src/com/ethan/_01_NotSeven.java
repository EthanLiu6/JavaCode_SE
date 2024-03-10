package com.ethan;

// 逢过七
public class _01_NotSeven {
    // [1, 100] 个位十位不为七，数值不为七的倍数
    public static void main(String[] args) {
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            // 判断三个条件
            int ge = num % 10;
            int shi = num / 10 % 10;
            int temp = num % 7; // 用于判断是否整除七

            if (ge != 7 && shi != 7 && temp != 0) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}
