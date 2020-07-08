package com.sevaslk.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef {
    private static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList = new ArrayList<>();
        arrayList.add(new MyClass(1));
        arrayList.add(new MyClass(4));
        arrayList.add(new MyClass(2));
        arrayList.add(new MyClass(9));
        arrayList.add(new MyClass(3));
        arrayList.add(new MyClass(7));

        MyClass maxValObj = Collections.max(arrayList, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}
