package com.ethan;

/*
    私有成员变量关键字:private
    this对象的来源和使用(为了见名知意)
 */
public class Car {
    private String brand;
    private String color;
    private double price;

    public void setBrand(String brand) {
        System.out.println(this); // this对象与Car()对象的地址一样

        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
