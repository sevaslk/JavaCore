package com.sevaslk.javacore.chapter4;

public class MultByTwo {
    public static void main(String[] args) {
        int num = 0xFFFFFFE;
        System.out.println(num);

        for (int i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
