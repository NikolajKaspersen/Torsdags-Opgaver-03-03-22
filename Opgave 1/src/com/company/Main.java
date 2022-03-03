package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
        System.out.println(Arrays.toString(nums));

        boolean haveISwapped = true;

        while (haveISwapped == true) {
            haveISwapped = false;
            for (int i = 0; i < nums.length; i++) {
                if ((i + 1 < nums.length) && nums[i] > nums[i + 1]) {
                    int swap = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = swap;
                    haveISwapped = true;
                }
            }
            System.out.println(Arrays.toString(nums));

        }
    }
}
