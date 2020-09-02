package com.sevaslk.javacore.patterns.adapter;

class AdapterDemo {
    public static void main(String[] args) {
        MyInterface someObj = new MyAdapter(); //var1
        someObj.methodA_fromMyInterface();

        someObj = new MyAdapter2(new MyClass()); //var2
        someObj.methodA_fromMyInterface();
    }
}
