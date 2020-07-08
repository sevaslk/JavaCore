package com.sevaslk.javacore.chapter18;

import java.util.ArrayList;

class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println("Содержимое списочного массива integerArrayList: " + integerArrayList);
        Integer[] integers = new Integer[integerArrayList.size()];
        integers = integerArrayList.toArray(integers);
        int sum = 0;
        for (int i : integers) {
            sum += i;
            System.out.println("Сумма: " + sum);
        }
    }
}
