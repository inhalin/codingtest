package bj;

import java.util.Scanner;

public class Q2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1, start = 1, end = 1, sum = 1;
        while (end != n) {
            if (sum > n) {
                sum -= start++;
            } else {
                if (sum == n) count++;
                sum += ++end;
            }
        }
        System.out.println(count);
    }
}
