package com.ethan;
/*
    面向对象入门
 */
public class _01_Phone {
    String brand;
    double size;
    double price;

    public void Call(String name){
        System.out.println("用" + brand + "手机给" + name + "打电话");
    }

    public String Send(String name, String msg){
        System.out.println("给" + name + "发了信息");
        return "发送信息: " + msg;
    }
    public void show(){
        System.out.println("品牌:" + brand);
        System.out.println("大小:" + size);
        System.out.println("价格:" + price);
    }
}
