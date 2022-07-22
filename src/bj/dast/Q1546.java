package bj.dast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            if (score > max) max = score;
            sum += score;
        }

        System.out.println(sum * 100.0 / max / n);
    }
}
