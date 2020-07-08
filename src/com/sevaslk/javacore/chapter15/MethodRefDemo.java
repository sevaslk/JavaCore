package com.sevaslk.javacore.chapter15;

interface StringFunc1 {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    static String stringOp(StringFunc stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбды повышают эффективность Java.";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
