package com.sevaslk.javacore.chapter5;

public class FindPrime {
    public static void main(String[] args) {
        boolean isPrime;
        int num = 14;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i < num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Простое число");
        } else {
            System.out.println("Не простое число");
        }

    }
}
