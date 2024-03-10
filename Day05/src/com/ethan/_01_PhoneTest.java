package com.ethan;

public class _01_PhoneTest {
    public static void main(String[] args) {
        _01_Phone p1 = new _01_Phone();
        p1.brand = "小米"; p1.size = 4.6; p1.price = 3999.00;
        p1.show();
        System.out.println("------------");
        _01_Phone p2 = new _01_Phone();
        p2.brand = "华为"; p2.size = 5.2; p2.price = 5888.00;
        p2.show();
        System.out.println("-------------");
        p1.Call("秋珠");
        String send = p1.Send("秋珠","我想你啦! 可是我还是想认真学习, 不然咋挣钱钱^_^");
        System.out.println(send);


    }
}
