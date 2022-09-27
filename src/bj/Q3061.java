package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3061 {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] ladder = new int[N];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                ladder[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    if (ladder[j] > ladder[j + 1]) {
                        swap(ladder, j, j + 1);
                    }
                }
            }

            sb.append(count).append("\n");
            count = 0;
        }

        System.out.println(sb);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        count++;
    }
}
