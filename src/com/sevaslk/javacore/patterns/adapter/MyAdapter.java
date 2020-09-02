package com.sevaslk.javacore.patterns.adapter;

class MyAdapter extends MyClass implements MyInterface {

    @Override
    public void methodA_fromMyInterface() {
        methodB_fromMyClass();
    }
}
