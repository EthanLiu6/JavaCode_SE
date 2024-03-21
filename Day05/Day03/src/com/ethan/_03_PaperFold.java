package com.ethan;
// 折纸，珠穆朗玛峰高为8848.86米，一张纸的厚度为0.1毫米，问折多少次可以达到珠穆朗玛峰的高度
public class _03_PaperFold {
    public static void main(String[] args) {
        // 不知道循环次数，选择使用while循环结构
        double fold = 0.1;
        int count = 0;
        while (fold < (8848.86 *1000)){
            fold *= 2;
            count ++;
        }
        System.out.println(count);
    }
}
