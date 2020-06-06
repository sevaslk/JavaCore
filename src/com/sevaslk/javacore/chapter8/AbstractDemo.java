package com.sevaslk.javacore.chapter8;


abstract class A_AbstractDemo {
    abstract void callme();

    void callmetoo() {
        System.out.println("Конкретный метод.");
    }
}

class B_AbstractDemo extends A_AbstractDemo {
    @java.lang.Override
    void callme() {
        System.out.println("Реализация метода callme() в классе B_AbstractDemo.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B_AbstractDemo b = new B_AbstractDemo();
        b.callme();
        b.callmetoo();
    }
}
