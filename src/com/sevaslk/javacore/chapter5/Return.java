package com.sevaslk.javacore.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if (t) return;
        System.out.println("Этот оператор не будет выполнен.");
    }
}
