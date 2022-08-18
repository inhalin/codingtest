package leetcode;

public class Q509FibonacciNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(5));
        System.out.println(s.fibDp(3));
    }

    static class Solution {
        public int fib(int n) {
            if (n == 0 || n == 1) return n;

            return fib(n - 1) + fib(n - 2);
        }

        public int fibDp(int n) {
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }

            return dp[n];
        }
    }
}
