package com.sevaslk.javacore.chapter14;

class Gen1<T> {
    T ob;

    Gen1(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}

class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Тест обобщений");
        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);

//ощибка выполнения        int i = (Integer) raw.getOb();
        strOb = raw; // скомпилируется, но потенциально ошибочно
        raw = iOb; // скомпилируется, но потенциально ошибочно
        //ощибка выполнения d = (Double) raw.getOb();

    }
}
