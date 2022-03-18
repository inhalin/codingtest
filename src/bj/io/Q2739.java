package bj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2739
//구구단
public class Q2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 9; i++) {
            sb.append(N).append(" * ").append(i).append(" = ").append(N * i).append("\n");
        }
        System.out.println(sb);
    }
}