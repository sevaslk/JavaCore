package com.sevaslk.javacore.chapter6;

class Stack {
    private int[] stck = new int[10];
    private int tos;

    Stack() {
        tos = -1; //инициализация вершины стека
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item; //помещение элемента в стек
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--]; //извлечение элемента из стека
        }
    }


}



