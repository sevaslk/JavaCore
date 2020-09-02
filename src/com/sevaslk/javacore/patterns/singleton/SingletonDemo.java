package com.sevaslk.javacore.patterns.singleton;

class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}

class Singleton {
    private int counter = 0;
    private static volatile Singleton singleton;

    private Singleton() {
        counter++;
    }

    static  Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}