package com.sevaslk.javacore.chapter7;

class VarArgs {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + " Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One param", 10);
        vaTest("Three param", 1, 2, 3);
        vaTest("No param");
    }
}
