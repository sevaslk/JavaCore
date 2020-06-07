package com.sevaslk.javacore.chapter9;

public interface IntStack {
    void push(int item);

    int pop();

    default void clear() throws UnsupportedOperationException {
        System.out.println("Метод clear() не реализован.");
    }
}
