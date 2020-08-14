package com.sevaslk.javacore.chapter14;

class Gen2<T> {
    private T ob;

    Gen2(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}

class Gen3<T, V> extends Gen2<T> {
    private V ob2;

    Gen3(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    V getOb2() {
        return ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {
        Gen3<String, Integer> x = new Gen3<>("Значение равно: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
