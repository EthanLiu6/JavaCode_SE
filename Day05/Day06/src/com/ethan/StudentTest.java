package com.ethan;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ethan_Liu", 20);
        System.out.println(s1.getName());
        System.out.println(s2.getAge());
    }
}
