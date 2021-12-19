package org.example.metod.stats;

public class Stats<T extends Number> {
    private T[] nums;

    public Stats(T... nums) {
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++) {
        // У nums[i] появился метод doubleValue() из класса Number,
        // который позволяет любой числовой объект привести к double
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
