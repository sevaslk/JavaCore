package com.sevaslk.javacore.chapter8;

import com.sevaslk.javacore.chapter6.Box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();

        System.out.println("Объем weightBox равен: " + weightBox.volume());
        System.out.println("Вес weightBox равен: " + weightBox.weight);
        System.out.println();
        System.out.println("Объем plainBox равен: " + plainBox.volume());
        assert plainBox instanceof BoxWeight;
        System.out.println("Вес weightBox равен: " + ((BoxWeight) plainBox).weight);

    }
}
