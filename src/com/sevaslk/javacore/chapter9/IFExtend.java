package com.sevaslk.javacore.chapter9;

interface AA {
    void meth1();
    void meth2();
}

interface BB extends AA {   //наследует meth1() и meth2() из АА
    void meth3();
}

class MyClass implements BB {   //должен реализовать все методы из АА и ВВ

    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
