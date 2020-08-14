package com.sevaslk.javacore.chapter14;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом Т является " + ob.getClass().getName()); // TODO: 17.07.2020 зачем здесь getName()??
    }// FIXME: 18.07.2020 test
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Тест обобщений");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: " + str);

    }
}
