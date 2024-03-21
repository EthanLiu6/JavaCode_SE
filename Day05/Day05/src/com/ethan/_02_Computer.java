package com.ethan;

public class _02_Computer{
    String brand;
    String color;
    double size;
    String CPU;
    int memory;
    double price;

    public void playGame(){
        System.out.println("正在启动游戏……");
    }

    public void writeCode(){
        System.out.println("开始敲代码了* * * * * *");
    }

    public void show(){
        System.out.println("品牌：" + brand);
        System.out.println("颜色：" + color);
        System.out.println("尺寸：" + size);
        System.out.println("CPU：" + CPU);
        System.out.println("内存：" + memory);
        System.out.println("价格：" + price);
    }
}