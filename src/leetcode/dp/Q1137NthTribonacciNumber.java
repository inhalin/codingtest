package leetcode.dp;

public class Q1137NthTribonacciNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.tribonacci(4));
        System.out.println(s.tribonacci(25));
    }

    static class Solution {
        public int tribonacci(int n) {
            int[] dp = new int[38];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;

            for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }

            return dp[n];
        }
    }
}
