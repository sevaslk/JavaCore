package com.sevaslk.javacore.chapter14;

class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Тип Т: " + ob1.getClass());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");
        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
