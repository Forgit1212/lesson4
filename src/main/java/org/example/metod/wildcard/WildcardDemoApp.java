package org.example.metod.wildcard;

public class WildcardDemoApp {
    public static void main(String args[]) {
        Stats1<Integer> iStats = new Stats1<>(1, 2, 3, 4, 5);
        System.out.println("Среднее iStats = " + iStats.avg());

        Stats1<Double> dStats = new Stats1<Double>(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Среднее dStats = " + dStats.avg());

        Stats1<Float> fStats = new Stats1<Float>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println("Среднее fStats = " + fStats.avg());

        System.out.print("Средние iStats и dStats ");
        if (iStats.sameAvg(dStats)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }

        System.out.print(" Средние iStats и fStats");
        if (iStats.sameAvg(fStats)) {
            System.out.println(" равны");
        } else {
            System.out.println(" отличаются");
        }
    }
}