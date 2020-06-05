package com.sevaslk.javacore.chapter7;

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    void test(int a) {
        System.out.println("int a: " + a);
    }

    void test(int a, int b) {
        System.out.println("int a, b: " + a + " " + b);
    }

    double test(double a) {
        return a *= a;
    }

}

class Overload {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        double result;

        obj.test();
        obj.test(10);
        obj.test(10, 20);
        System.out.println("double a: " + obj.test(123.345));
    }
}
