package com.sevaslk.javacore.chapter28.task2;

import java.util.stream.IntStream;

class FizzBuzz {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).parallel()
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEachOrdered(System.out::println);
    }
}
