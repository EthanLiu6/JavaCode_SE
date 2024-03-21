package com.ethan;

public class CatTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);

        c1.setBrand("奔驰");
        c1.setColor("白色");
        c1.setPrice(150000.0);
        System.out.println(c1.getBrand() +" " + c1.getColor() + " " + c1.getPrice() + "万");

    }
}
