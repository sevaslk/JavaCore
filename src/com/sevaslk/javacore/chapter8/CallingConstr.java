package com.sevaslk.javacore.chapter8;

import java.lang.*;

class ABC1 {
    ABC1() {
        System.out.println("В конструкторе ABC1.");
    }
}

class ABC2 extends ABC1 {
    ABC2() {
        System.out.println("В конструкторе ABC2.");
    }
}

class ABC3 extends ABC2 {
    ABC3() {
        System.out.println("В конструкторе ABC3.");
    }
}


public class CallingConstr {
    public static void main(String[] args) {
        ABC3 abc3 = new ABC3();
        int g = abc3.hashCode();
    }

}
