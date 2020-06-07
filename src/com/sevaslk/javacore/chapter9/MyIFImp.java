package com.sevaslk.javacore.chapter9;

interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект String по умолчанию";
    }

    static int getDefaultNumber() {
        return 33333;
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    public int getNumber() {
        return 200;
    }

    public String getString() {
        return "Объект String из MyIFImp2 ";
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());    //вызов getNumber() из MyIFImp
        System.out.println(obj.getString());    //вызов getString() из MyIF

        MyIF obj1 = new MyIFImp2();
        System.out.println(obj1.getNumber());    //вызов getNumber() из MyIFImp2
        System.out.println(obj1.getString());    //вызов переопределенного getString() из MyIFImp2

        System.out.println(MyIF.getDefaultNumber()); //вызов статического getDefaultNumber() из MyIF

    }
}
