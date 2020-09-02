package com.sevaslk.javacore.patterns.proxy;

interface Image {
    void display();
}

class RealImage implements Image {
    private String file;

    RealImage(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("Loading image..." + file);
    }

    @Override
    public void display() {
        System.out.println("Show image" + file);
    }
}

class ProxyImage implements Image {
    private String file;
    private RealImage image;

    ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}