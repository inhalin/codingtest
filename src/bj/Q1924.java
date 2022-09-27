package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1924
//2007년
public class Q1924 {
    static final String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    static int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {

//        int[] add = new int[12];
//        for (int i = 1; i < date.length; i++) {
//            add[i] = date[i - 1] % 7 + add[i - 1];
//            add[i] %= 7;
//        }

        // 더 간결한 답
        for (int i = 1; i < date.length; i++) {
            date[i] += date[i - 1];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
//        int idx = (y + add[x - 1]) % 7;
//        System.out.println(days[idx]);

        y += date[x - 1];
        System.out.println(days[y % 7]);
    }
}