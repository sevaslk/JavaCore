package com.sevaslk.javacore.chapter6;

class Box {
    private double width;
    private double height;
    private double depth;

    double volume() {
        return width * height * depth;
    }

    Box(double width, double height, double depth) {
        System.out.println("Конструктор Box");
        this.width = width;
        this.height = height;
        this.depth = depth;

    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

//        myBox1.setDim(10, 20, 15);
//        myBox2.setDim(3, 6, 9);

        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());


    }
}
