package com.ethan;
/*
    数组学习,找到最大值
 */

public class _01ArrayMaxNum {
    public static void main(String[] args) {
        int[] arr01 = {123, 34, 45, 56, 3, 23, 4, 456, 56};
        int max = arr01[0];
        for (int i = 1; i < arr01.length; i ++){
            {
                max = (arr01[i] > max) ? arr01[i] : max;
            }
        }
        System.out.println("最大值为:" + max);
    }
}
