package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2558
// A+B -2
public class Q2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        if (A > 0 && B < 10) {
            //첫째 줄에 A+B를 출력한다.
            System.out.println(A + B);
        }
    }
}
