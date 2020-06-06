package com.sevaslk.javacore.chapter8;

class A {
    int i, j;

    void show_ij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void show_k() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();

        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Содержимое объекта superObj: ");
        superObj.show_ij();
        System.out.println();

        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Содержимое объекта subObj: ");
        subObj.show_ij();
        subObj.show_k();

        System.out.println();
        System.out.println("Сумма i, j, k в объекте subObj: ");
        subObj.sum();
    }
}
