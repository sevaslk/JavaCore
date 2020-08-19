package com.sevaslk.javacore.chapter28.task1;

import java.util.concurrent.Semaphore;

class Foo implements Runnable {

    Semaphore semaphore;

    public Foo(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void first() {
        System.out.print("First");
    }

    public void second() {
        System.out.print("Second");
    }

    public void third() {
        System.out.println("Third");
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            first();
            second();
            third();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Foo foo = new Foo(semaphore);
        new Thread(foo).start();
        new Thread(foo).start();
        new Thread(foo).start();

    }
}
