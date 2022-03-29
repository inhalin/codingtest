package leetcode.arrays;

import java.util.Arrays;

public class Q88MergeSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        s.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n != 0) {
                for (int i = 0; m < nums1.length ; i++) {
                    nums1[m++] = nums2[i];
                }
            }
            Arrays.sort(nums1);
        }
    }
}
