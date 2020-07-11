package com.sevaslk.javacore.chapter15;

interface MyFunc4<T> {
    MyClass4<T> func(T n);
}

class MyClass4<T> {
    private T val;

    MyClass4(T v) {
        val = v;
    }

    MyClass4() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class ConstructorRefDemo2 {

    public static void main(String[] args) {
        MyFunc4<Integer> myClassCons = MyClass4<Integer>::new;
        MyClass4<Integer> myClass4 = myClassCons.func(100);
        MyClass4<Integer> myFunc41 = new MyClass4<>(100); // TODO: 11.07.2020 эквивилентна ли строка 27 и 28???

        System.out.println("Значение val в объекте myClass4 равно: " + myClass4.getVal());
    }
}

