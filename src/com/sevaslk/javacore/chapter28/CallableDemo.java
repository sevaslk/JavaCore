package com.sevaslk.javacore.chapter28;

import java.util.concurrent.*;

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Запуск");

        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e){
            System.out.println(e+"error");
        } catch (ExecutionException exc){
            System.out.println(exc+ " err");
        }
        es.shutdown();
        System.out.println("Завершение");
    }
}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double side1;
    double side2;

    Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}