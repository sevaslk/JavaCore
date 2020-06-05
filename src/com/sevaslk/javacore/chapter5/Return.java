package com.sevaslk.javacore.chapter5;

public class Return {
    public static void main(String[] args) {

        System.out.println("До возврата.");
        if (true) return;
        System.out.println("Этот оператор не будет выполнен.");
    }
}
