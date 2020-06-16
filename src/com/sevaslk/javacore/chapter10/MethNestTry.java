package com.sevaslk.javacore.chapter10;

import javax.imageio.stream.ImageInputStream;

public class MethNestTry {
    static void nestTry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);    //если а==1, то генерируется деление на ноль
            }
            if (a == 2) {
                int[] c = {1};
                c[42] = 99;         //если а==2, то генерируется выход за пределы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;     //если args.length==0, сгенерируется деление на 0
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
