package com.sevaslk.javacore.patterns.factorymethod;

interface SpirtZavod {
    Alcohol createAlco();
}

class VodkaFactory implements SpirtZavod {
    @Override
    public Alcohol createAlco() {
        return new Vodka();
    }
}

class RomFactory implements SpirtZavod {
    @Override
    public Alcohol createAlco() {
        return new Rom();
    }
}

class SamogonFactory implements SpirtZavod {
    @Override
    public Alcohol createAlco() {
        return new Samogon();
    }
}