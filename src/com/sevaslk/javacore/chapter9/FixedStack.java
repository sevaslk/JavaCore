package com.sevaslk.javacore.chapter9;

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {          //выделение памяти и инициализация стека
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;     //размещение элемента в стеке
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
