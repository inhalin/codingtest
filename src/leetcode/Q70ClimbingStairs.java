package leetcode;

public class Q70ClimbingStairs {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(5));
        System.out.println(s.climbStairsDp(5));
        System.out.println(s.climbStairsDpOptimize(5));
    }

    static class Solution {
        public int climbStairs(int n) {
            if (n == 0 || n == 1 || n == 2) return n;

            return climbStairs(n - 1) + climbStairs(n - 2);
        }

        public int climbStairsDp(int n) {
            int[] dp = new int[46];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }

        public int climbStairsDpOptimize(int n) {
            if (n == 0 || n == 1 || n == 2) return n;
            int prev = 1;
            int next = 2;
            for (int i = 3; i <= n; i++) {
                int temp = prev + next;
                prev = next;
                next = temp;
            }

            return next;
        }
    }
}
