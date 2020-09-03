package com.sevaslk.javacore.patterns.strategy;

class StrategyClient {
    private Sorting strategy;

    void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
