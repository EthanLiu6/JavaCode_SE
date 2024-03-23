package com.ethan;
/*
    二维数组打乱
 */

import java.util.Random;

public class _05TwoArrRandom {
    public static void main(String[] args) {
        //初始化静态二维数组
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 12, 78},
        };

        //产生随机数对象
        Random rdm = new Random();

        //遍历二维数组 产生随机数索引 置换
        for (int i = 0; i < arr.length; i++) { // 遍历二维数组
            for (int j = 0; j < arr[i].length; j++) {
                int rdmIdx = rdm.nextInt(arr.length); // 产生二维随机索引(二维数组索引)
                int rdmNumIdx = rdm.nextInt(arr[i].length); // 产生一维数组索引
                //置换
                int temp = arr[i][j];
                arr[i][j] = arr[rdmIdx][rdmNumIdx];
                arr[rdmIdx][rdmNumIdx] = temp;
            }
        }

        //打印置换后的数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
