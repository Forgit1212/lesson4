package org.example.metod.wildcard;

public class Stats1<T extends Number> {
    private T[] nums;

    public Stats1(T... nums) {
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    public boolean sameAvg(Stats1<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}