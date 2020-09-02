package com.sevaslk.javacore.patterns.adapter;

class MyAdapter2 implements MyInterface {
    private MyClass myObj;

    public MyAdapter2(MyClass myObj) {
        this.myObj = myObj;
    }

    @Override
    public void methodA_fromMyInterface() {
        myObj.methodB_fromMyClass();
    }
}
