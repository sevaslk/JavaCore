package com.sevaslk.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' для выхода.");
        do {
            c = (char) bufferedReader.read();
            System.out.print(c);
        } while (c != 'q');
    }
}
