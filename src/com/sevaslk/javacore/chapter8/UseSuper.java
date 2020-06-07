package com.sevaslk.javacore.chapter8;

class A1 {
    int i;
}

class A2 extends A1 {
    int i;

    A2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        A2 subObj = new A2(1, 2);
        subObj.show();
    }
}

