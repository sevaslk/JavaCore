package com.sevaslk.javacore.chapter7;

class TestCall {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

}

public class CallByValue {
    public static void main(String[] args) {
        TestCall obj = new TestCall();
        int a = 15;
        int b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);
        obj.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
