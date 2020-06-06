package com.sevaslk.javacore.chapter8;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment obj) {
//        клон объекта
        super(obj);
        cost = obj.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        System.out.println("Объем shipment1 равен: " + shipment1.volume());
        System.out.println("Вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки shipment1: $" + shipment1.cost);
        System.out.println();

        System.out.println("Объем shipment2 равен: " + shipment2.volume());
        System.out.println("Вес shipment2 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки shipment2: $" + shipment2.cost);
        System.out.println();
    }
}

