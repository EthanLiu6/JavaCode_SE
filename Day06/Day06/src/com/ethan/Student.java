package com.ethan;

/*
    构造函数{空参构造, 带参构造}  --->方法重载
 */
public class Student {

    private  String name;
    private  int age;

    public Student() {
        System.out.println("实现了空参构造" + this);
    }

    public Student(String name, int age) {
        System.out.println("实现了带参构造");
        this.name = name;
        this.age = age;
    }

    public void  setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
