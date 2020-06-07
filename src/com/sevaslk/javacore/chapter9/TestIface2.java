package com.sevaslk.javacore.chapter9;

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
        new AnotherClient().callback(42);

    }
}
