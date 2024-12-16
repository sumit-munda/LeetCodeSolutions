package com.Arrays;

import java.util.Arrays;

public class Introduction {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int i = 0;
        int countMax = 0;
        while(i < nums.length) {
            if(nums[i] == 1) {
                count++;
            }
            if(nums[i] == 0) {
                countMax = Math.max(countMax, count);
                count = 0;
            }
            i++;
        }
        return Math.max(countMax, count);
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums) {
            int digits = 0;
            digits = (int)(Math.log10(i) + 1);
            if(digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = (int)(Math.pow(nums[i], 2));
        }
        Arrays.sort(ans);
        return ans;
    }
}
