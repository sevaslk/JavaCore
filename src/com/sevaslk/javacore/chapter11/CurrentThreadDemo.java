package com.sevaslk.javacore.chapter11;

class CurrentThreadDemo {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);
        t.setName("MyThread");
        System.out.println("После изменения потока: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
