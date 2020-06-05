package com.sevaslk.javacore.chapter7;

class TestRetObj {
    int a;

    TestRetObj(int i) {
        a = i;
    }

    TestRetObj incrByTen() {
        return new TestRetObj(a + 10);
    }
}

public class RetObj {
    public static void main(String[] args) {
        TestRetObj obj1 = new TestRetObj(2);
        TestRetObj obj2 = obj1.incrByTen();
        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);
        obj2 = obj2.incrByTen();
        System.out.println("obj2.a после второго применения incrByTen(): " + obj2.a);
    }
}
