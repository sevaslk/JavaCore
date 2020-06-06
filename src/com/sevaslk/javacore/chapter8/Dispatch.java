package com.sevaslk.javacore.chapter8;

class A_Dispatch {
    void callMe() {
        System.out.println("В методе callMe() из класса A_Dispatch");
    }
}

class B_Dispatch extends A_Dispatch {
    void callMe() {
        System.out.println("В методе callMe() из класса B_Dispatch");
    }
}

class C_Dispatch extends A_Dispatch {
    void callMe() {
        System.out.println("В методе callMe() из класса C_Dispatch");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A_Dispatch a = new A_Dispatch();
        B_Dispatch b = new B_Dispatch();
        C_Dispatch c = new C_Dispatch();

        A_Dispatch r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
