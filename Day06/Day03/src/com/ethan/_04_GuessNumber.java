package com.ethan;

import java.util.Random;
import java.util.Scanner;

// 随机数猜测[1, 100]
public class _04_GuessNumber {
    public static void main(String[] args) {
        // 生成随机数
        int rnd_num = new Random().nextInt(100) +1;
        // 控制台输入对象
        Scanner sc = new Scanner(System.in);
        // 计数器
        int count = 0;

        // 猜数字
        while (true) {
            // 控制台输入
            System.out.println("已生成随机数，请输入猜测数字：");
            int guess_num = sc.nextInt();
            count++;

            // 判断三种猜测状态
            if (guess_num < 1 || guess_num > 100) {
                System.out.println("ERROR：请输入1-100的整数");
            } else if (guess_num > rnd_num) {
                System.out.println("猜大了");
            } else if (guess_num < rnd_num) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("总共猜了" + count + "次");

    }
}
