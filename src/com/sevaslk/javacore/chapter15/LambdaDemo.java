package com.sevaslk.javacore.chapter15;

@FunctionalInterface
interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Const: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Random: " + myNum.getValue());
        System.out.println("Another Random: " + myNum.getValue());

    }
}