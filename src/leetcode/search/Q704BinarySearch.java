package leetcode.search;

import java.util.Arrays;

public class Q704BinarySearch {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 4, 5, 7, 9, 24, 46, 58, 39};
        System.out.println(s.search(nums, 46));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int res = Arrays.binarySearch(nums, target);
            if (res < 0) return -1;
            return res;
        }
    }
}

