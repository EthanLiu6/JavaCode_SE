package com.ethan;

public class _03_MovieTest {
    public static void main(String[] args) {
        _03_Movie m1 = new _03_Movie();
        m1.setName("吴京 ");
        m1.setType("战争片 ");
        m1.setDirector("珠珠");
        System.out.println(m1.getName() + m1.getType() + m1.getDirector());

        _03_Movie m2 = new _03_Movie("珠珠 ","动画片 ","灰灰");
        System.out.println(m2.getName() + m2.getType() + m2.getDirector());
    }
}
