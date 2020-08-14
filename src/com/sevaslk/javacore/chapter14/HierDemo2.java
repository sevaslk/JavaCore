package com.sevaslk.javacore.chapter14;

class NonGen4 {
    int num;

    NonGen4(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }
}

class Gen4<T> extends NonGen4 {
    T ob;

    public Gen4(int num, T ob) {
        super(num);
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}

class HierDemo2 {
    public static void main(String[] args) {
        Gen4<String> w = new Gen4<>(47, "Hello");
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());


    }
}
