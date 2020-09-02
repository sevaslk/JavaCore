package com.sevaslk.javacore.patterns.factorymethod;

class FactoryMethodDemo {
    public static void main(String[] args) {
        SpirtZavod spirtZavod = new VodkaFactory();
        Alcohol napitok = spirtZavod.createAlco();
        napitok.drink();
    }
}
