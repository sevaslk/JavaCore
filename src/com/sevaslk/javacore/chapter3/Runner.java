package com.sevaslk.javacore.chapter3;
//import static com.sevaslk.javacore.chapter3.Light.*;

public class Runner {
    public static void main(String[] args) {
        double r = 10.8;
        System.out.println("Square is " + Area.circleArea(r) + " parrots.");
        System.out.println("---------------------------------------------");


        Light.lightSpeedCalculate(1000);

        CharDemo charDemo = new CharDemo();
        charDemo.charCodePrinter();

        {
            Object object1 = new Object();
            Object object2 = new Object();
            System.out.println(object1);
            System.out.println(object1.toString());
            System.out.println(object1.hashCode());
            System.out.println(object2.toString());
            System.out.println(object2.hashCode());
            object1 = object2;
            System.out.println(object1.equals(object2));
        }

    }
}
