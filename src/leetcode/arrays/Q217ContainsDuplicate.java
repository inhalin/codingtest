package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Q217ContainsDuplicate {
    public static void main(String[] args) {
        Solution s= new Solution();

        int[][] nums = {
                {1,2,3,1},
                {1,2,3,4},
                {1,1,1,3,3,4,3,2,4,2}
        };

        for (int[] num : nums) {
            System.out.println("nums = " + Arrays.toString(num));
            System.out.println(s.containsDuplicate(num));
        }

    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            for (int num : nums) {
                hs.add(num);
            }

            return nums.length > hs.size();
        }
    }
}
