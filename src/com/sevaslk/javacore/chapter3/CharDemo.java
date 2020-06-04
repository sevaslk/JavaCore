package com.sevaslk.javacore.chapter3;

class CharDemo {

    void charCodePrinter() {

        char chl = 88;         // код символа 'Х'
        char ch2 = 'Y';
        char ch3 = ch2++;
        char ch4 = (char) (88 + 1);
        System.out.println("ch1: " + chl);
        System.out.println("ch2: " + ch2);
        System.out.println("ch3: " + ch3);
        System.out.println("ch4: " + ch4);
        System.out.println("---------------------------------------");
    }
}
