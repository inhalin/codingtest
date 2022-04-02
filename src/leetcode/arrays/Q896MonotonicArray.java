package leetcode.arrays;

import java.util.Arrays;

public class Q896MonotonicArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums = {
                {1, 2, 2, 3},
                {6, 5, 4, 4},
                {1, 3, 2},
                {3, 4, 2, 3}
        };

        for (int[] num : nums) {
            System.out.println("nums = " + Arrays.toString(num));
            System.out.println(s.isMonotonic(num));
        }

    }

    static class Solution {
        public boolean isMonotonic(int[] nums) {
            int dir = (nums[0] <= nums[nums.length - 1]) ? 1 : -1;
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] - nums[i + 1]) * dir > 0) return false;
            }
            return true;
        }
    }
}
