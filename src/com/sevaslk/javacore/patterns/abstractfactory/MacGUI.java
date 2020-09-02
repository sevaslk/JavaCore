package com.sevaslk.javacore.patterns.abstractfactory;

class MacGUI implements Gui {
    @Override
    public void showGui() {
        System.out.println("MacOS GUI");
    }
}
