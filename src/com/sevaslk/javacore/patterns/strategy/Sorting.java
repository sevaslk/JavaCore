package com.sevaslk.javacore.patterns.strategy;

import java.util.Arrays;

interface Sorting {
    void sort(int[] arr);
}

class BubbleSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sorting:");
        System.out.println("before:\t " + Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("after: \t" + Arrays.toString(arr));
    }
}

class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sorting:");
        System.out.println("before:\t " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }

            }
        }
        System.out.println("after: \t" + Arrays.toString(arr));
    }
}

class InsertingSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Inserting sorting:");
        System.out.println("before:\t " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("after: \t" + Arrays.toString(arr));
    }
}