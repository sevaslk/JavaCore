package com.sevaslk.javacore.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        Box myCube = new Box(5);
        Box myBox3 = new Box();
        Box myClone = new Box(myBox1);

        System.out.println("Объем myBox1 равен " + myBox1.volume());
        System.out.println("Объем myBox2 равен " + myBox2.volume());
        System.out.println("Объем myCube равен " + myCube.volume());
        System.out.println("Объем myBox3 равен " + myBox3.volume());
        System.out.println("Объем myClone равен " + myClone.volume());

    }
}
