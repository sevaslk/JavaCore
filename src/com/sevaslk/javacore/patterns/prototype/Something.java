package com.sevaslk.javacore.patterns.prototype;

class Something implements Copyable {
    private int option1;
    private String option2;

    Something(int option1, String option2) {
        this.option1 = option1;
        this.option2 = option2;
    }

    @Override
    public Object copy() {
        Something copy = new Something(option1, option2);
        return copy;
    }

    @Override
    public String toString() {
        return "Something1{" +
                "option1=" + option1 +
                ", option2='" + option2 + '\'' +
                '}';
    }
}
