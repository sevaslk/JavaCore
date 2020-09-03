package com.sevaslk.javacore.patterns.observer;

import java.util.ArrayList;
import java.util.List;

interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class MeteoStation implements Observed {
    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    void setMeasurement(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(temperature, pressure);

        }
    }
}