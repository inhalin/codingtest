package leetcode.arrays;

import java.util.Arrays;

public class Q189RotateArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr= {1,2,3,4,5,6,7};
        int[] arr2 = {-1, -100, 3, 99};

        s.rotate(arr, 3);
        s.rotate(arr2, 2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    static class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public void reverse(int[] nums, int start, int end) {
            while (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
