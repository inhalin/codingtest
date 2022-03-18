package bj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10818
//최소, 최대
public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 1000001;
        int max = -1000001;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println(min + " " + max);
    }
}