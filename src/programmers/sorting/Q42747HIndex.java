package programmers.sorting;

public class Q42747HIndex {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] nums = {
                {3,0,6,1,5},    // 3
                {6, 5, 5, 5, 5, 2, 1, 0}    // 5
        };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(s.solution(nums[i]));
        }
    }

    static class Solution {
        public int solution(int[] citations) {
            int hIndex = citations.length;

            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= hIndex) break;
                hIndex--;
            }

            return hIndex;
        }
    }
}
