package com.ethan;
/*
定义一个方法,接受三个整数,获取中间值并打印
通过键盘获取三个整数,作为参数传递调用方法
 */

import java.util.Scanner;

public class _01_NumCompare {
    public static void main(String[] args) {
        System.out.println("中间的一个数值为:" + getMidNum());
    }

    private static int getMidNum() {
        int[] nums = getNums();
        // 获取中间值
        int mid_num;
        if (nums[0] == nums[1] && nums[0] == nums[2]){
            System.out.println("三数相同");
            mid_num = nums[0];
        }else if (nums[0] > nums[1] && nums[0] > nums[2]){
            mid_num = nums[1] > nums[2] ? nums[1]: nums[2];
        }else if (nums[1] > nums[0] && nums[1] > nums[2]){
            mid_num = nums[0] > nums[2] ? nums[0]: nums[2];
        }else {
            mid_num = nums[0] > nums[1] ? nums[0]: nums[1];
        }
        return mid_num;
    }

    private static int[] getNums() {
        System.out.print("num_1 = ");
        int num_1 = new Scanner(System.in).nextInt();
        System.out.print("num_2 = ");
        int num_2 = new Scanner(System.in).nextInt();
        System.out.print("num_3 = ");
        int num_3 = new Scanner(System.in).nextInt();

        return new int[]{num_1, num_2, num_3};
    }
}