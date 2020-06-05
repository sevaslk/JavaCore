package com.sevaslk.javacore.chapter7;

class TestPassObjRe {
    int a, b;

    TestPassObjRe(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TestPassObjRe obj) {
        obj.a *= 2;
        obj.b /= 2;
    }
}

public class PassObjRe {
    public static void main(String[] args) {
        TestPassObjRe obj = new TestPassObjRe(15, 20);
        System.out.println("obj.a и obj.b до вызова: " + obj.a + " " + obj.b);
        obj.meth(obj);
        System.out.println("obj.a и obj.b после вызова: " + obj.a + " " + obj.b);
    }
}
