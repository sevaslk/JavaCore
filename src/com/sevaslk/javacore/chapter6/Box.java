package com.sevaslk.javacore.chapter6;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(Box obj) {
        System.out.println("Конструктор с объектом в параметрах.");
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    public Box(double width, double height, double depth) {
        System.out.println("Конструктор Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        System.out.println("Конструктор Box без параметров");
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(double len) {
        System.out.println("Конструктор Box все стороны равны(куб)");
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }
}
