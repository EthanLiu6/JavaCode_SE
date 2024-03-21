package com.ethan;

public class _04_CameraTest {
    public static void main(String[] args) {
        _04_Camera c1 = new _04_Camera();
        c1.setBrand("nano");
        c1.setType("xxx");
        c1.setScene("III");
        c1.setPlace("china");
        c1.setPlace("1234");
        c1.setColor("黑色");
        c1.setAppraise(8765);
        c1.show();

        System.out.println("------------------");

        _04_Camera c2 = new _04_Camera(
                "nika",
                "EOS 400d",
                "III镜头",
                "china",
                6543,
                "白色",
                3456765);
        c2.show();
    }
}
