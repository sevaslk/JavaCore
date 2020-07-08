package com.sevaslk.javacore.chapter15;

interface MyFunc3 {
    MyClass3 func(int n);
}

interface MyArrayCreator<T> {
    T func(int n);
}

class MyClass3 {
    private int val;

    MyClass3(int v) {
        val = v;
    }

    MyClass3() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc3 myClassCons = MyClass3::new;
        MyClass3 myClass3 = myClassCons.func(100);

        System.out.println("Значение val в объекте myClass3 равно: " + myClass3.getVal());

        MyArrayCreator<MyClass3[]> mcArrayCons = MyClass3[]::new;
        MyClass3[] a = mcArrayCons.func(2);
        a[0] = new MyClass3(1);
        a[1] = new MyClass3(2);
    }
}
