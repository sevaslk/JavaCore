package com.sevaslk.javacore.chapter8;

class A_Override {
    int i, j;

    A_Override(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B_Override extends A_Override {
    int k;

    B_Override(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
public class Override {
    public static void main(String[] args) {
        B_Override subObj = new B_Override(1, 2, 3);

        subObj.show("Это к.");
        subObj.show();
    }
}
