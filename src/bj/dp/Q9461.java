package bj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] p = new long[n + 2];
            p[1]= p[2] = 1;
            for (int j = 3; j <= n; j++) {
                p[j] = p[j-2] + p[j-3];
            }
            sb.append(p[n]).append("\n");
        }
        System.out.println(sb);
    }
}
