package com.sevaslk.javacore.patterns.prototype;

class PrototypeDemo {
    public static void main(String[] args) {
        Something origin = new Something(1, "aaa");
        System.out.println(origin);

        Something copy = (Something) origin.copy();
        System.out.println(copy);

        SomethingFactory factory = new SomethingFactory(copy);
        Something s1 = factory.makeCopy();
        System.out.println(s1);

        factory.setSomething(new Something(2, "bbb"));
        Something s2 = factory.makeCopy();
        System.out.println(s2);

    }
}
