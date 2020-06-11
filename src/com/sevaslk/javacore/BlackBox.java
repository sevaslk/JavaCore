package com.sevaslk.javacore;

import java.util.Objects;

class BlackBox {
    private int varA;
    private int varB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA &&
                varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varA, varB);
    }

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }
}

class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object1.equals(object2));
    }
}