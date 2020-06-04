package com.sevaslk.javacore.chapter3;

class Light {
    /*Вычисляется расстояние, проходимое светом за 1000 дней,
    используя переменные типа long*/
    static {
        System.out.println("***static block from class Light***");
    }

    static void lightSpeedCalculate(long days) {

        int lightSpeed = 186000; // приблизительная скорость света, миль в секунду
        long seconds = days * 24 * 60 * 60; // преобразование дней в секунды

        long distance = lightSpeed * seconds; // вычисление расстояния

        System.out.println("Зa " + days + " дней свет пройдет около " + distance + " миль.");
        System.out.println("---------------------------------");


    }
}
