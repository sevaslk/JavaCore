package com.sevaslk.javacore.patterns.strategy;

class StrategyDemo {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] arr0 = {1, 2, 4, 3, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(arr0);

        int[] arr1 = {11, 56, 3, 12, 3, 6, 44};
        strategyClient.setStrategy(new InsertingSort());
        strategyClient.executeStrategy(arr1);

        int[] arr2 = {1, -6, 31, 2, 13, 6, 44, 0};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(arr2);


    }
}
