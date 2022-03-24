package leetcode.search;

public class Q35SearchInsertPosition {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 3, 5, 6};
        int[] expected = {0, 0, 1, 1, 2, 2, 3, 4};
        for (int i = 0; i < 8; i++) {
            System.out.print("expected: " + expected[i] + " >> ");
            System.out.println(s.searchInsert(nums, i));
        }
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            int mid = (start + end) / 2;

            while (start <= end) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                    if (end < 0) return 0;
                    mid = (start + end) / 2;
                } else {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
            }

            return mid + 1;
        }
    }
}
