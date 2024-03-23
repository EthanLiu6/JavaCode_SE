package com.ethan;

/*
    键盘录入动态数组值
 */

import java.util.Scanner;

public class _03DynamicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //键盘对象
        Scanner input = new Scanner(System.in);

        //遍历键盘输入并加入数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数:");
            arr[i] = input.nextInt();
        }
        //格式化打印数组
        printRst(arr);

    }

    public static void printRst(int[] arr) {
        /*
            res: arr = [1, 2, 3, 4, 5]
         */
        System.out.print("arr = [");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) { // 最后一位不需要", "
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");

    }
}
