package com.sevaslk.javacore.chapter8;

import com.sevaslk.javacore.chapter6.Box;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);

        System.out.println("Объем myBox1 равен: " + myBox1.volume());
        System.out.println("Вес myBox1 равен: " + myBox1.weight);
        System.out.println();

        System.out.println("Объем myBox2 равен: " + myBox2.volume());
        System.out.println("Вес myBox2 равен: " + myBox2.weight);
        System.out.println();

        System.out.println("Объем myBox3 равен: " + myBox3.volume());
        System.out.println("Вес myBox3 равен: " + myBox3.weight);
        System.out.println();

        System.out.println("Объем myCube равен: " + myCube.volume());
        System.out.println("Вес myCube равен: " + myCube.weight);
        System.out.println();

        System.out.println("Объем myClone равен: " + myClone.volume());
        System.out.println("Вес myClone равен: " + myClone.weight);
        System.out.println();


    }
}