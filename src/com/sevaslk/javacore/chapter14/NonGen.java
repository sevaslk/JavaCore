package com.sevaslk.javacore.chapter14;

class NonGen {
    private Object ob;

    NonGen(Object o) {
        ob = o;
    }
    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Объект относится к типу: " + ob.getClass().getName());
    }
}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

// скомпилируется, но код неправильный        iOb = strOb;
// скомпилируется с ошибкой       v = (Integer) iOb.getOb();
// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
    }
}
