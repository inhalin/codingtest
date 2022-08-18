package leetcode;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

//        System.out.println(Arrays.toString(sortedSquares(nums)));
//        System.out.println(Arrays.toString(sortedSquares(nums2)));
        System.out.println(Arrays.toString(sortedSquares1(nums)));
        System.out.println(Arrays.toString(sortedSquares1(nums2)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);

        return nums;
    }

    public static int[] sortedSquares1(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int idx = res.length - 1;

        while (j >= i ) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[idx--] = nums[i] * nums[i];
                i++;
            } else {
                res[idx--] = nums[j] * nums[j];
                j--;
            }
        }

        return res;
    }
}
