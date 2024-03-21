package com.ethan;

/*
    电影类:
        1.成员变量: 必须私有
        2.构造方法: 提供两种
        3.成员方法: 针对私有变量提供get和set方法, 根据要求添加其他成员方法
 */
public class _03_Movie {
//    1.成员变量
    private String name;
    private String type;
    private String director;

//    2.构造方法

    public _03_Movie() {
    }

    public _03_Movie(java.lang.String name, java.lang.String type, java.lang.String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }
//    3.成员方法


    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getDirector() {
        return director;
    }

    public void setDirector(java.lang.String director) {
        this.director = director;
    }
}
