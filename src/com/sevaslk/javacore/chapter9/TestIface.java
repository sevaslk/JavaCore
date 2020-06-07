package com.sevaslk.javacore.chapter9;

class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        Client client = new Client();
        client.nonIfaceMeth();
        client.callback(11);
    }
}
