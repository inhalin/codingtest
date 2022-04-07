package bj.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652 {
    static int n, m;
    static int[] list;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        list = new int[m];
        dfs(1, 0);
        System.out.println(sb);
    }

    static void dfs(int idx, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(list[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i <= n; i++) {
            list[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
