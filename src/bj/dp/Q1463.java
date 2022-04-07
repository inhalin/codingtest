package bj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1463
//1로 만들기
public class Q1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(recur(n));
        System.out.println(recur(n, 0));
        System.out.println(bottomUp(n));
    }

    static int recur(int n) {
        Integer[] dp;

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else {
                dp[n] = recur(n - 1) + 1;
            }
        }

        return dp[n];
    }

    static int recur(int n, int count) {
        if (n < 2) return count;

        return Math.min(recur(n / 2, count + 1 + (n % 2)), recur(n / 3, count + 1 + n % 3));
    }

    static int bottomUp(int n) {
        int[] bu = new int[n + 1];
        bu[0] = bu[1] = 0;

        for (int i = 2; i <= n; i++) {
            bu[i] = bu[i-1] + 1;
            if (i % 2 == 0) bu[i] = Math.min(bu[i], bu[i/2] + 1);
            if (i % 3 == 0) bu[i] = Math.min(bu[i], bu[i/3] + 1);
        }

        return bu[n];
    }
}
