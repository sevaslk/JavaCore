package com.sevaslk.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo2 {
    static String stringOp(StringFunc2 stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбды повышают эффективность Java.";
        String outStr;
        MyStringOps2 stringOps = new MyStringOps2();

        outStr = stringOp(stringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
