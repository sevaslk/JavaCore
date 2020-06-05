package com.sevaslk.javacore.chapter6;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box obj) {
        System.out.println("Конструктор с объектом в параметрах.");
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box(double width, double height, double depth) {
        System.out.println("Конструктор Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        System.out.println("Конструктор Box без параметров");
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len) {
        System.out.println("Конструктор Box все стороны равны(куб)");
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
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
