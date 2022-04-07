package bj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//score OX퀴즈
public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int sum = 0;
            int cnt = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    sum += ++cnt;
                } else {
                    cnt = 0;
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
