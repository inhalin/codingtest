package bj.greedy;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11047
//동전 0
public class Q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] types = new int[n];
        for (int i = 0; i < n; i++) {
            types[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = types.length - 1; k != 0; i--) {
            count += k / types[i];
            k = k % types[i];
        }
        System.out.println(count);
    }
}