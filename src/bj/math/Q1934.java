package bj.math;

//https://www.acmicpc.net/problem/1934
//최소공배수
public class Q1934 {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 45000},
                {6, 10},
                {13, 17}
        };

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int c = gcd(a, b);
            System.out.println(a*b/c);
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
