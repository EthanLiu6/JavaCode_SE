package com.ethan;

/*
    数组打乱
 */

import java.util.Random;

public class _02ArrayAutoRandom {
    public static void main(String[] args) {
        int[] arr = {234, 34, 345, 2, 45, 6, 876, 24};
        Random rdm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rdmIdx = rdm.nextInt(arr.length);
            System.out.println("第" + i+1 + "次的随机数为: " + arr[rdmIdx]);
            int temp = arr[i];
            arr[i] = arr[rdmIdx];
            arr[rdmIdx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
