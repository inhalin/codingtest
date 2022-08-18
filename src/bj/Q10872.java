package bj;

import java.io.*;

//https://www.acmicpc.net/problem/10872
//팩토리얼
public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }

    static int factorial(int a) {
        if (a <= 1) return 1;
        return a * factorial(a - 1);
    }
}
