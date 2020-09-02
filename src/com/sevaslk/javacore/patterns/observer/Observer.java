package com.sevaslk.javacore.patterns.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

interface Observer {
    void handleEvent(int temp, int presser);
}

class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Weather is changed. Temperature = " + temp + ", Pressure = " + presser + ".");
    }
}

class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Weather is changed. Temperature = " + temp + ", Pressure = " + presser + ".");
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}