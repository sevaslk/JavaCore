package com.sevaslk.javacore.patterns.facade;

class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.load();
    }
}

class ComputerFacade {
    private Power power = new Power();
    private Internet internet = new Internet();
    private URL url = new URL();

    void load() {
        power.on();
        internet.connect();
        url.saveUrl(internet.isConnect());
    }
}

class Power {
    void on() {
        System.out.println("Power ON");
    }

    void off() {
        System.out.println("Power OFF");
    }
}

class Internet {
    private boolean connect = false;
    void connect() {
        connect = true;
        System.out.println("internet connected");
    }

    void disconnect() {
        connect = false;
        System.out.println("internet disconnected");
    }

    boolean isConnect() {
        return connect;
    }
}

class URL {
    void saveUrl(boolean connect) {
        if (connect) {
            System.out.println("URL saved");
        } else {
            System.out.println("URL saving failed");
        }

    }
}