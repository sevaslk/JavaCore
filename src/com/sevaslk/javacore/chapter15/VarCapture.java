package com.sevaslk.javacore.chapter15;

interface MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = n -> {
            int v = num + n;
//            num = 9;
//            num++;
            return v;
        };
        System.out.println(myLambda.func(1));
    }
}
