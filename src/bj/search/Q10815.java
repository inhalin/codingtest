package bj.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] check = new int[n];
        for (int i = 0; i < n; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(check);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[m];
        for (int i = 0; i < m; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(check, cards[i]) > -1) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
