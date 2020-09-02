package com.sevaslk.javacore.patterns.templatemethod;

class TemplateMethodDemo {
    public static void main(String[] args) {
        C a = new A();
        a.methodFromAbstractC();

        System.out.println();

        C b = new B();
        b.methodFromAbstractC();

    }
}

abstract class C {
    void methodFromAbstractC() {
        System.out.println("1");
        System.out.println("2");
        abstractMethodFromAbstractC();
    }

    abstract void abstractMethodFromAbstractC();
}

class A extends C {
    @Override
    void abstractMethodFromAbstractC() {
        System.out.println("3");
    }
}

class B extends C {
    @Override
    void abstractMethodFromAbstractC() {
        System.out.println("4");
    }
}