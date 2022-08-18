package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2440
//별 찍기 - 3
public class Q2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--) {
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}