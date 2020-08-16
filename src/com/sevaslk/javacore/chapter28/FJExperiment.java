package com.sevaslk.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction {
    private static final long serialVersionUID = 6841102253261589861L;
    private int seqThreshold;
    private double[] data;
    private int start;
    private int end;

    Transform(double[] data, int start, int end, int seqThreshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.seqThreshold = seqThreshold;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if (data[i] % 2 == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new Transform(data, start, middle, seqThreshold), new Transform(data, middle, end, seqThreshold));
        }
    }
}

class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;
        if (args.length != 2) {
            System.out.println("Использование: FJExperiment параллелизм порог ");
            return;
        }
        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);
        long beginT;
        long endT;
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        Transform task = new Transform(nums, 0, nums.length, threshold);
        fjp.execute(task);
        while (!task.isDone()) {
            System.out.println(fjp);
        }
        beginT = System.nanoTime();
        fjp.invoke(task);
        endT = System.nanoTime();
        System.out.println("Уровень параллелизма: " + pLevel);
        System.out.println("Порог последовательной обработки: " + threshold);
        System.out.println("Истекшее время: " + (endT - beginT) + " нс");
        System.out.println();
    }
}
