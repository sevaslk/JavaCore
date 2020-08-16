package com.sevaslk.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimpExec {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        es.execute(new MyThread5(cd1, "A"));
        es.execute(new MyThread5(cd2, "B"));
        es.execute(new MyThread5(cd3, "C"));
        es.execute(new MyThread5(cd4, "D"));

        cd1.await();
        cd2.await();
        cd3.await();
        cd4.await();
        es.shutdown();
        System.out.println("Завершение потков");
    }
}

class MyThread5 implements Runnable {

    private String name;
    private CountDownLatch latch;

    MyThread5(CountDownLatch c, String n) {
        latch = c;
        name = n;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}