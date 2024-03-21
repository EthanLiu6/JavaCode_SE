package com.ethan;

public class _02_ComputerTest {
    public static void main(String[] args) {
        _02_Computer cpt = new _02_Computer();
        _02_Computer cpt2 = new _02_Computer();

        System.out.println(cpt + "\n" +cpt2);

        cpt.brand = "华为";
        cpt.color = "银白";
        cpt.size = 13.7;
        cpt.CPU = "i5";
        cpt.memory = 256;
        cpt.price = 4599.0;

        cpt.show();

        cpt.playGame();
        cpt.writeCode();
    }
}
