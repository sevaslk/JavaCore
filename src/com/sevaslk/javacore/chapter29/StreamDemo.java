package com.sevaslk.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(51);

        System.out.println("Исходный список: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.max(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("Минимальное значение: " + minVal.get());
        }
        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Отсортированный поток данных: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.println("Нечетные значения:");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
