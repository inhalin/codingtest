package leetcode;

import java.util.Arrays;

public class Q53MaximunSubarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums = {
                {-2, 1, -3, 4, -1, 2, 1, -5, 4},
                {1},
                {5, 4, -1, 7, 8}
        };

        for (int[] num : nums) {
            System.out.println("nums = " + Arrays.toString(num));
            System.out.println(s.maxSubArray(num));
        }
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;

            for (int num : nums) {
                sum += num;
                if (sum > max) max = sum;
                if (sum < 0) sum = 0;
            }

            return max;
        }
    }
}
