package com.sevaslk.javacore.patterns.flyweight;

interface Shape {
    void draw(int x, int y);
}

class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : Draw point");
    }
}

class Circle implements Shape {
    private int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : Draw circle with radius " + r);
    }
}

class Square implements Shape {
    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : Draw square with side " + a);
    }
}