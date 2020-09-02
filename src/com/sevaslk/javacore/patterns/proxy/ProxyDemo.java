package com.sevaslk.javacore.patterns.proxy;

class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage(" C:\\12345");
        image.display();
    }
}
