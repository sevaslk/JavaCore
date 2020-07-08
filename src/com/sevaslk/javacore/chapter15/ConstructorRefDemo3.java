package com.sevaslk.javacore.chapter15;

interface MyFunc5<R, T> {
    R func(T n);
}

class MyClass5<T> {
    private T val;

    MyClass5(T v) {
        val = v;
    }

    MyClass5() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass5_1 {
    String str;

    MyClass5_1(String s) {
        str = s;
    }

    MyClass5_1() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc5<MyClass5<Double>, Double> myClassCons = MyClass5<Double>::new;
        MyClass5<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно: " + mc.getVal());

        MyFunc5<MyClass5_1, String> myClassCons2 = MyClass5_1::new;
        MyClass5_1 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно: " + mc2.getVal());
    }
}
