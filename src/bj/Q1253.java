package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(nums);
        int count = 0;
        for (int k = 0; k < N; k++) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] == nums[k]) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (nums[i] + nums[j] < nums[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
