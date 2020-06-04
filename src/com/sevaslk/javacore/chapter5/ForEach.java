package com.sevaslk.javacore.chapter5;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;

        for (int i : nums) {
            sum += i;
            if (i == 5) {
                break;
            }
            System.out.println(sum);

        }
    }
}
