package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
    static int n;
    static int k;
    static int[] map = new int[100_001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        bfs(n);
        System.out.println(map[k]);
    }

    private static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);

        while (!q.isEmpty()) {
            int temp = q.poll();

            if (temp == k) break;

            if (temp - 1 >= 0 && map[temp - 1] == 0) {
                map[temp - 1] = map[temp] + 1;
                q.offer(temp - 1);
            }

            if (temp + 1 < map.length && map[temp + 1] == 0) {
                map[temp + 1] = map[temp] + 1;
                q.offer(temp + 1);
            }

            if (temp * 2 < map.length && map[temp * 2] == 0) {
                map[temp * 2] = map[temp] + 1;
                q.offer(temp * 2);
            }
        }
    }
}
