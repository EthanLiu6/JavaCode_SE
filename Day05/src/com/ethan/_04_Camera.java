package com.ethan;

/*
    相机类:
        brand
        type
        scene
        place
        price
        color
        appraise
 */

public class _04_Camera {
//    1. 成员变量
    private String brand;
    private String type;
    private String scene; // 镜头
    private String place; // 产地
    private double price;
    private String color;
    private int appraise; // 评价数

//    2. 构造方法


    public _04_Camera() {
    }

    public _04_Camera(String brand, String type, String scene, String place, double price, String color, int appraise) {
        this.brand = brand;
        this.type = type;
        this.scene = scene;
        this.place = place;
        this.price = price;
        this.color = color;
        this.appraise = appraise;
    }
//    3. 成员方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAppraise() {
        return appraise;
    }

    public void setAppraise(int appraise) {
        this.appraise = appraise;
    }

//    show成员方法
    public void show(){
        System.out.println("品牌:" + brand);
        System.out.println("类型:" + type);
        System.out.println("镜头:" + scene);
        System.out.println("产地:" + place);
        System.out.println("价格:" + price);
        System.out.println("颜色:" + color);
        System.out.println("评论数:" + appraise);
    }
}
