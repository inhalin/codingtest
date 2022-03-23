package bj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11005
//진법 변환 2
public class Q11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % b;
            if (r < 10) {
                sb.append((char) (r + '0'));
            } else {
                sb.append((char) (r + 55));
            }
            n = n / b;
        }
        System.out.println(sb.reverse());
    }
}
