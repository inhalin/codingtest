package bj.math;

//https://www.acmicpc.net/problem/1850
//최대공약수
public class Q1850 {
    public static void main(String[] args) {
        int[][] arr = {
                {3,4},
                {3,6},
        };

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int c =gcd(a, b);
            for (int j = 0; j < c; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
