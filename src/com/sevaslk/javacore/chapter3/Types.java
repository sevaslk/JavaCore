package com.sevaslk.javacore.chapter3;

public class Types {
    public static void main(String[] args) {
        byte b;
        int i = 256;
        double d = 333.145;

        b = (byte) i;
        System.out.println(b);
        i = (int) d;
        System.out.println(i);
        b = (byte) d;
        System.out.println(b);
        byte b1 = 50;
        b1 = (byte) (b * 2);


        double result = (5.67f * (byte) 42) + (50000 / 'a') - (.1234d * (short) 1024);
        System.out.println(result);
    }
}
