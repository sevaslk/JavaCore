package com.sevaslk.javacore.chapter20;

import java.io.*;

class MyClass implements Serializable {
    private String s;
    private int i;
    private double d;

    MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStream = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}
