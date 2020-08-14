package com.sevaslk.javacore.chapter14;

class Stats1<T extends Number> {
    private T[] nums;

    Stats1(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats1<?> ob) {
        return average() == ob.average();
    }
}

class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats1<Integer> iOb = new Stats1<>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> dOb = new Stats1<>(dnums);
        double w = dOb.average();
        System.out.println("Среднее значение iOb равно " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> fOb = new Stats1<>(fnums);
        double x = fOb.average();
        System.out.println("Среднее значение iOb равно " + x);

        System.out.print("Средние значения iOb и dOb ");
        if (iOb.sameAvg(dOb)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");
        }

        System.out.print("Средние значения iOb и fOb ");
        if (iOb.sameAvg(fOb)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");
        }
    }
}
