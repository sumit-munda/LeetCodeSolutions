package com.Main;

import com.Arrays.Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Introduction sol = new Introduction();

        System.out.println(7 / 2);
    }

    public static int setBits(int a) {
        int count = 0;
        while (a != 0) {
            int rem = a & 1;
            if (rem == 1) count++;
            a = a >> 1;
        }
        return count;
    }

    public static int bitwiseComplement(int n) {
        int m = n;
        int mask = 0;
        if (n == 0) {
            return 1;
        }
        while (m != 0) {
            mask = (mask << 1) | 1; // (mask)-1111 & 0101 =
            m = m >> 1;
        }
        int ans = (~n) & mask; // 0101 & 1111
        return ans;
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwo2(int n) {
        int ans = 1;
        for (int i = 0; i <= 30; i++) {
            if (ans == n) {
                return true;
            }
            if (ans < Integer.MAX_VALUE / 2) {
                ans = ans * 2;
            }
        }
        return false;
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] ansList = {i, j};
                    return ansList;
                }
            }
        }
        return new int[]{};
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ansList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ansList;
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;

        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                low++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, high);
                high--;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}